package io.github.dklages20.igdb.types.deserializers

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.deser.std.StdDeserializer
import io.github.dklages20.igdb.types.Cover

class CoverDeserializer : StdDeserializer<Cover>(List::class.java) {
    override fun deserialize(p: JsonParser, ctxt: DeserializationContext?): Cover {
        val node = p.codec.readTree<JsonNode>(p)
        return when {
            node.isInt -> Cover(node.asInt())
            node.isObject -> p.codec.treeToValue(node, Cover::class.java)
            else -> throw Exception("Received unexpected value for ${Cover::class}")
        }
    }
}

class CoverListDeserializer: StdDeserializer<List<Cover>>(List::class.java) {
    companion object {
        private val coverDeserializer = CoverDeserializer()
    }

    override fun deserialize(p: JsonParser, ctxt: DeserializationContext?): List<Cover> {
        val node = p.codec.readTree<JsonNode>(p)
        return if (node.isArray) {
            node.mapNotNull { coverDeserializer.deserialize(p.codec.treeAsTokens(it), ctxt) }
        } else {
            emptyList()
        }
    }
}
