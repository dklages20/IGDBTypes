package io.github.dklages20.igdb.types.deserializers

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.deser.std.StdDeserializer
import io.github.dklages20.igdb.types.CollectionRelationType

class CollectionRelationTypeDeserializer : StdDeserializer<CollectionRelationType>(List::class.java) {
    override fun deserialize(p: JsonParser, ctxt: DeserializationContext?): CollectionRelationType {
        val node = p.codec.readTree<JsonNode>(p)
        return when {
            node.isInt -> CollectionRelationType(node.asInt())
            node.isObject -> p.codec.treeToValue(node, CollectionRelationType::class.java)
            else -> throw Exception("Received unexpected value for ${CollectionRelationType::class}")
        }
    }
}

class CollectionRelationTypeListDeserializer: StdDeserializer<List<CollectionRelationType>>(List::class.java) {
    companion object {
        private val collectionRelationTypeDeserializer = CollectionRelationTypeDeserializer()
    }

    override fun deserialize(p: JsonParser, ctxt: DeserializationContext?): List<CollectionRelationType> {
        val node = p.codec.readTree<JsonNode>(p)
        return if (node.isArray) {
            node.mapNotNull { collectionRelationTypeDeserializer.deserialize(p.codec.treeAsTokens(it), ctxt) }
        } else {
            emptyList()
        }
    }
}
