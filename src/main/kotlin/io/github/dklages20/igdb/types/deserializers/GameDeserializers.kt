package io.github.dklages20.igdb.types.deserializers

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.deser.std.StdDeserializer
import io.github.dklages20.igdb.types.Game

class GameDeserializer : StdDeserializer<Game>(List::class.java) {
    override fun deserialize(p: JsonParser, ctxt: DeserializationContext?): Game {
        val node = p.codec.readTree<JsonNode>(p)
        return when {
            node.isInt -> Game(node.asInt())
            node.isObject -> p.codec.treeToValue(node, Game::class.java)
            else -> throw Exception("Received unexpected value for ${Game::class}")
        }
    }
}
