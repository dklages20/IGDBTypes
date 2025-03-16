package io.github.dklages20.igdb.types.deserializers

import com.fasterxml.jackson.databind.deser.std.StdDeserializer
import io.github.dklages20.igdb.types.CharacterGender

class CharacterGenderDeserializer: StdDeserializer<CharacterGender>(CharacterGender::class.java) {
    override fun deserialize(p: com.fasterxml.jackson.core.JsonParser, ctxt: com.fasterxml.jackson.databind.DeserializationContext?): CharacterGender {
        val node = p.codec.readTree<com.fasterxml.jackson.databind.JsonNode>(p)
        return when {
            node.isInt -> CharacterGender(node.asInt(), null, null, null, null)
            node.isObject -> p.codec.treeToValue(node, CharacterGender::class.java)
            else -> throw Exception("Received unexpected value for ${CharacterGender::class}")
        }
    }
}

class CharacterGenderListDeserializer: StdDeserializer<List<CharacterGender>>(List::class.java) {
    companion object {
        private val characterGenderDeserializer = CharacterGenderDeserializer()
    }

    override fun deserialize(p: com.fasterxml.jackson.core.JsonParser, ctxt: com.fasterxml.jackson.databind.DeserializationContext?): List<CharacterGender> {
        val node = p.codec.readTree<com.fasterxml.jackson.databind.JsonNode>(p)
        return if (node.isArray) {
            node.mapNotNull { characterGenderDeserializer.deserialize(p.codec.treeAsTokens(it), ctxt) }
        } else {
            emptyList()
        }
    }
}
