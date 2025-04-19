package io.github.dklages20.igdb.types.deserializers

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.deser.std.StdDeserializer
import io.github.dklages20.igdb.types.CollectionType

class CollectionTypeDeserializer : StdDeserializer<CollectionType>(List::class.java) {
    override fun deserialize(p: JsonParser, ctxt: DeserializationContext?): CollectionType {
        val node = p.codec.readTree<JsonNode>(p)
        return when {
            node.isInt -> CollectionType(node.asInt())
            node.isObject -> p.codec.treeToValue(node, CollectionType::class.java)
            else -> throw Exception("Received unexpected value for ${CollectionType::class}")
        }
    }
}

class CollectionTypeListDeserializer: StdDeserializer<List<CollectionType>>(List::class.java) {
    companion object {
        private val collectionTypeDeserializer = CollectionTypeDeserializer()
    }

    override fun deserialize(p: JsonParser, ctxt: DeserializationContext?): List<CollectionType> {
        val node = p.codec.readTree<JsonNode>(p)
        return if (node.isArray) {
            node.mapNotNull { collectionTypeDeserializer.deserialize(p.codec.treeAsTokens(it), ctxt) }
        } else {
            emptyList()
        }
    }
}
