package io.github.dklages20.igdb.types.deserializers

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.deser.std.StdDeserializer
import io.github.dklages20.igdb.types.Organization

class OrganizationDeserializer : StdDeserializer<Organization>(List::class.java) {
    override fun deserialize(p: JsonParser, ctxt: DeserializationContext?): Organization {
        val node = p.codec.readTree<JsonNode>(p)
        return when {
            node.isInt -> Organization(node.asInt(), null, null, null, null)
            node.isObject -> p.codec.treeToValue(node, Organization::class.java)
            else -> throw Exception("Received unexpected value for ${Organization::class}")
        }
    }
}
