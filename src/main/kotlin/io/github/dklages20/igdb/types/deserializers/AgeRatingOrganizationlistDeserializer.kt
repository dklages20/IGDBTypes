package io.github.dklages20.igdb.types.deserializers

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.deser.std.StdDeserializer
import io.github.dklages20.igdb.types.AgeRatingOrganization

class AgeRatingOrganizationListDeserializer : StdDeserializer<List<AgeRatingOrganization>>(List::class.java) {
    companion object {
        private val ageRatingOrganizationDeserializer = AgeRatingOrganizationDeserializer()
    }
    override fun deserialize(p: JsonParser, ctxt: DeserializationContext?): List<AgeRatingOrganization> {
        val node = p.codec.readTree<JsonNode>(p)
        return if(node.isArray) {
            node.mapNotNull { ageRatingOrganizationDeserializer.deserialize(p.codec.treeAsTokens(it), ctxt) }
        } else {
            emptyList()
        }
    }
}
