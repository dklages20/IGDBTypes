package io.github.dklages20.igdb.types.deserializers

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.deser.std.StdDeserializer
import io.github.dklages20.igdb.types.CollectionMembership
import io.github.dklages20.igdb.types.CollectionMembershipType

class CollectionMembershipTypeDeserializer : StdDeserializer<CollectionMembershipType>(List::class.java) {
    override fun deserialize(p: JsonParser, ctxt: DeserializationContext?): CollectionMembershipType {
        val node = p.codec.readTree<JsonNode>(p)
        return when {
            node.isInt -> CollectionMembershipType(node.asInt())
            node.isObject -> p.codec.treeToValue(node, CollectionMembershipType::class.java)
            else -> throw Exception("Received unexpected value for ${CollectionMembershipType::class}")
        }
    }
}

class CollectionMembershipTypeListDeserializer: StdDeserializer<List<CollectionMembershipType>>(List::class.java) {
    companion object {
        private val collectionMembershipTypeDeserializer = CollectionMembershipTypeDeserializer()
    }

    override fun deserialize(p: JsonParser, ctxt: DeserializationContext?): List<CollectionMembershipType> {
        val node = p.codec.readTree<JsonNode>(p)
        return if (node.isArray) {
            node.mapNotNull { collectionMembershipTypeDeserializer.deserialize(p.codec.treeAsTokens(it), ctxt) }
        } else {
            emptyList()
        }
    }
}
