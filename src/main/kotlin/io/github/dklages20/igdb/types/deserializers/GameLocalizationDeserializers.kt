package io.github.dklages20.igdb.types.deserializers

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.deser.std.StdDeserializer
import io.github.dklages20.igdb.types.GameLocalization

class GameLocalizationDeserializer : StdDeserializer<GameLocalization>(List::class.java) {
    override fun deserialize(p: JsonParser, ctxt: DeserializationContext?): GameLocalization {
        val node = p.codec.readTree<JsonNode>(p)
        return when {
            node.isInt -> GameLocalization(node.asInt())
            node.isObject -> p.codec.treeToValue(node, GameLocalization::class.java)
            else -> throw Exception("Received unexpected value for ${GameLocalization::class}")
        }
    }
}

class GameLocalizationListDeserializer: StdDeserializer<List<GameLocalization>>(List::class.java) {
    companion object {
        private val gameLocalizationDeserializer = GameLocalizationDeserializer()
    }

    override fun deserialize(p: JsonParser, ctxt: DeserializationContext?): List<GameLocalization> {
        val node = p.codec.readTree<JsonNode>(p)
        return if (node.isArray) {
            node.mapNotNull { gameLocalizationDeserializer.deserialize(p.codec.treeAsTokens(it), ctxt) }
        } else {
            emptyList()
        }
    }
}
