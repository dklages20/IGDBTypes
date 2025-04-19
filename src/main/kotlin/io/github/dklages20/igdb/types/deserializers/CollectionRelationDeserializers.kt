package io.github.dklages20.igdb.types.deserializers

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.deser.std.StdDeserializer
import io.github.dklages20.igdb.types.CollectionRelation

class CollectionRelationDeserializer : StdDeserializer<CollectionRelation>(List::class.java) {
    override fun deserialize(p: JsonParser, ctxt: DeserializationContext?): CollectionRelation {
        val node = p.codec.readTree<JsonNode>(p)
        return when {
            node.isInt -> CollectionRelation(node.asInt())
            node.isObject -> p.codec.treeToValue(node, CollectionRelation::class.java)
            else -> throw Exception("Received unexpected value for ${CollectionRelation::class}")
        }
    }
}

class CollectionRelationListDeserializer: StdDeserializer<List<CollectionRelation>>(List::class.java) {
    companion object {
        private val collectionRelationDeserializer = CollectionRelationDeserializer()
    }

    override fun deserialize(p: JsonParser, ctxt: DeserializationContext?): List<CollectionRelation> {
        val node = p.codec.readTree<JsonNode>(p)
        return if (node.isArray) {
            node.mapNotNull { collectionRelationDeserializer.deserialize(p.codec.treeAsTokens(it), ctxt) }
        } else {
            emptyList()
        }
    }
}
