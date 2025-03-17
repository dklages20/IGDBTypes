package io.github.dklages20.igdb.types.deserializers

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.deser.std.StdDeserializer
import io.github.dklages20.igdb.types.Artwork

class ArtworkDeserializer : StdDeserializer<Artwork>(List::class.java) {
    override fun deserialize(p: JsonParser, ctxt: DeserializationContext?): Artwork {
        val node = p.codec.readTree<JsonNode>(p)
        return when {
            node.isInt -> Artwork(node.asInt(), null, null, null, null, null, null, null, null)
            node.isObject -> p.codec.treeToValue(node, Artwork::class.java)
            else -> throw Exception("Received unexpected value for ${Artwork::class}")
        }
    }
}

class ArtworkListDeserializer : StdDeserializer<List<Artwork>>(List::class.java) {
    companion object {
        private val artworkDeserializer = ArtworkDeserializer()
    }

    override fun deserialize(p: JsonParser, ctxt: DeserializationContext?): List<Artwork> {
        val node = p.codec.readTree<JsonNode>(p)
        return if (node.isArray) {
            node.mapNotNull { artworkDeserializer.deserialize(p.codec.treeAsTokens(it), ctxt) }
        } else {
            emptyList()
        }
    }
}
