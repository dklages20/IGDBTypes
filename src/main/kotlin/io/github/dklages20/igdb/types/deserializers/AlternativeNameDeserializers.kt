package io.github.dklages20.igdb.types.deserializers

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.deser.std.StdDeserializer
import io.github.dklages20.igdb.types.AlternativeName

class AlternativeNameDeserializer : StdDeserializer<AlternativeName>(List::class.java) {
    override fun deserialize(p: JsonParser, ctxt: DeserializationContext?): AlternativeName {
        val node = p.codec.readTree<JsonNode>(p)
        return when {
            node.isInt -> AlternativeName(node.asInt(), null, null, null, null)
            node.isObject -> p.codec.treeToValue(node, AlternativeName::class.java)
            else -> throw Exception("Received unexpected value for ${AlternativeName::class}")
        }
    }
}

class AlternativeNameListDeserializer : StdDeserializer<List<AlternativeName>>(List::class.java) {
    companion object {
        private val alternativeNameDeserializer = AlternativeNameDeserializer()
    }

    override fun deserialize(p: JsonParser, ctxt: DeserializationContext?): List<AlternativeName> {
        val node = p.codec.readTree<JsonNode>(p)
        return if (node.isArray) {
            node.mapNotNull { alternativeNameDeserializer.deserialize(p.codec.treeAsTokens(it), ctxt) }
        } else {
            emptyList()
        }
    }
}
