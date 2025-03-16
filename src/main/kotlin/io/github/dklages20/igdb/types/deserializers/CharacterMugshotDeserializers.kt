package io.github.dklages20.igdb.types.deserializers

import com.fasterxml.jackson.databind.deser.std.StdDeserializer
import io.github.dklages20.igdb.types.CharacterMugshot

class CharacterMugshotDeserializer: StdDeserializer<CharacterMugshot>(CharacterMugshot::class.java) {
    override fun deserialize(p: com.fasterxml.jackson.core.JsonParser, ctxt: com.fasterxml.jackson.databind.DeserializationContext?): CharacterMugshot {
        val node = p.codec.readTree<com.fasterxml.jackson.databind.JsonNode>(p)
        return when {
            node.isInt -> CharacterMugshot(node.asInt(), null, null, null, null, null, null, null)
            node.isObject -> p.codec.treeToValue(node, CharacterMugshot::class.java)
            else -> throw Exception("Received unexpected value for ${CharacterMugshot::class}")
        }
    }
}

class CharacterMugshotListDeserializer: StdDeserializer<List<CharacterMugshot>>(List::class.java) {
    companion object {
        private val characterMugshotDeserializer = CharacterMugshotDeserializer()
    }

    override fun deserialize(p: com.fasterxml.jackson.core.JsonParser, ctxt: com.fasterxml.jackson.databind.DeserializationContext?): List<CharacterMugshot> {
        val node = p.codec.readTree<com.fasterxml.jackson.databind.JsonNode>(p)
        return if (node.isArray) {
            node.mapNotNull { characterMugshotDeserializer.deserialize(p.codec.treeAsTokens(it), ctxt) }
        } else {
            emptyList()
        }
    }
}
