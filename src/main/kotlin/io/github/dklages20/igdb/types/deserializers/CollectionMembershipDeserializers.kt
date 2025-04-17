package io.github.dklages20.igdb.types.deserializers

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.deser.std.StdDeserializer
import io.github.dklages20.igdb.types.CollectionMembership

class CollectionMembershipDeserializer : StdDeserializer<CollectionMembership>(List::class.java) {
    override fun deserialize(p: JsonParser, ctxt: DeserializationContext?): CollectionMembership {
        val node = p.codec.readTree<JsonNode>(p)
        return when {
            node.isInt -> CollectionMembership(node.asInt())
            node.isObject -> p.codec.treeToValue(node, CollectionMembership::class.java)
            else -> throw Exception("Received unexpected value for ${CollectionMembership::class}")
        }
    }
}

class CollectionMembershipListDeserializer: StdDeserializer<List<CollectionMembership>>(List::class.java) {
    companion object {
        private val collectionMembershipDeserializer = CollectionMembershipDeserializer()
    }

    override fun deserialize(p: JsonParser, ctxt: DeserializationContext?): List<CollectionMembership> {
        val node = p.codec.readTree<JsonNode>(p)
        return if (node.isArray) {
            node.mapNotNull { collectionMembershipDeserializer.deserialize(p.codec.treeAsTokens(it), ctxt) }
        } else {
            emptyList()
        }
    }
}
