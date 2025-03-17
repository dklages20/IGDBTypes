package io.github.dklages20.igdb.types.deserializers

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.deser.std.StdDeserializer
import io.github.dklages20.igdb.types.CharacterSpecie

class CharacterSpecieDeserializer: StdDeserializer<CharacterSpecie>(CharacterSpecie::class.java) {
    override fun deserialize(p: JsonParser, ctxt: DeserializationContext?): CharacterSpecie {
        val node = p.codec.readTree<JsonNode>(p)
        return when {
            node.isInt -> CharacterSpecie(node.asInt(), null, null, null, null)
            node.isObject -> p.codec.treeToValue(node, CharacterSpecie::class.java)
            else -> throw Exception("Received unexpected value for ${CharacterSpecie::class}")
        }
    }
}

class CharacterSpecieListDeserializer: StdDeserializer<List<CharacterSpecie>>(List::class.java) {
    companion object {
        private val characterSpecieDeserializer = CharacterSpecieDeserializer()
    }

    override fun deserialize(p: JsonParser, ctxt: DeserializationContext?): List<CharacterSpecie> {
        val node = p.codec.readTree<JsonNode>(p)
        return if (node.isArray) {
            node.mapNotNull { characterSpecieDeserializer.deserialize(p.codec.treeAsTokens(it), ctxt) }
        } else {
            emptyList()
        }
    }
}
