package io.github.dklages20.igdb.types.deserializers

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.deser.std.StdDeserializer
import io.github.dklages20.igdb.types.Character

class CharacterDeserializer : StdDeserializer<Character>(Character::class.java) {
    override fun deserialize(p: JsonParser, ctxt: DeserializationContext?): Character {
        val node = p.codec.readTree<JsonNode>(p)
        return when {
            node.isInt -> Character(node.asInt(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null)
            node.isObject -> p.codec.treeToValue(node, Character::class.java)
            else -> throw Exception("Received unexpected value for ${Character::class}")
        }
    }
}

class CharacterListDeserializer : StdDeserializer<List<Character>>(List::class.java) {
    companion object {
        private val characterDeserializer = CharacterDeserializer()
    }

    override fun deserialize(p: JsonParser, ctxt: DeserializationContext?): List<Character> {
        val node = p.codec.readTree<JsonNode>(p)
        return if (node.isArray) {
            node.mapNotNull { characterDeserializer.deserialize(p.codec.treeAsTokens(it), ctxt) }
        } else {
            emptyList()
        }
    }
}

