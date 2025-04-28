package io.github.dklages20.igdb.types.deserializers

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.deser.std.StdDeserializer
import io.github.dklages20.igdb.types.IGDBBaseObject
import kotlin.reflect.KClass

open class IGDBObjectDeserializer<T : IGDBBaseObject>(
    private val clazz: KClass<T>
) : StdDeserializer<T>(List::class.java) {
    override fun deserialize(p: JsonParser, ctxt: DeserializationContext?): T {
        val node = p.codec.readTree<JsonNode>(p)
        return when {
            node.isInt -> clazz.java.getConstructor(Int::class.java).newInstance(node.asInt())
            node.isObject -> p.codec.treeToValue(node, clazz.java)
            else -> throw Exception("Received unexpected value for ${clazz.simpleName}")
        }
    }
}

open class IGDBObjectListDeserializer<T : IGDBBaseObject>(
    private val elementDeserializer: IGDBObjectDeserializer<T>
) : StdDeserializer<List<T>>(List::class.java) {
    override fun deserialize(p: JsonParser, ctxt: DeserializationContext?): List<T> {
        val node = p.codec.readTree<JsonNode>(p)
        return if (node.isArray) {
            node.mapNotNull { elementDeserializer.deserialize(p.codec.treeAsTokens(it), ctxt) }
        } else {
            emptyList()
        }
    }
}