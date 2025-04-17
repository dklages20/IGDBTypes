package io.github.dklages20.igdb.types.deserializers

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.deser.std.StdDeserializer
import io.github.dklages20.igdb.types.Collection
import io.github.dklages20.igdb.types.Game

class CollectionDeserializer : StdDeserializer<Collection>(List::class.java) {
    override fun deserialize(p: JsonParser, ctxt: DeserializationContext?): Collection {
        val node = p.codec.readTree<JsonNode>(p)
        return when {
            node.isInt -> Collection(node.asInt())
            node.isObject -> p.codec.treeToValue(node, Collection::class.java)
            else -> throw Exception("Received unexpected value for ${Game::class}")
        }
    }
}

class CollectionListDeserializer: StdDeserializer<List<Collection>>(List::class.java) {
    companion object {
        private val collectionDeserializer = CollectionDeserializer()
    }

    override fun deserialize(p: JsonParser, ctxt: DeserializationContext?): List<Collection> {
        val node = p.codec.readTree<JsonNode>(p)
        return if (node.isArray) {
            node.mapNotNull { collectionDeserializer.deserialize(p.codec.treeAsTokens(it), ctxt) }
        } else {
            emptyList()
        }
    }
}
