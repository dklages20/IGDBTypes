package io.github.dklages20.igdb.types.deserializers

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.deser.std.StdDeserializer
import io.github.dklages20.igdb.types.AgeRatingCategory

class AgeRatingCategoryDeserializer : StdDeserializer<AgeRatingCategory>(List::class.java) {
    override fun deserialize(p: JsonParser, ctxt: DeserializationContext?): AgeRatingCategory {
        val node = p.codec.readTree<JsonNode>(p)
        return when {
            node.isInt -> AgeRatingCategory(node.asInt(), null, null, null, null, null)
            node.isObject -> p.codec.treeToValue(node, AgeRatingCategory::class.java)
            else -> throw Exception("Received unexpected value for ${AgeRatingCategory::class}")
        }
    }
}

class AgeRatingCategoryListDeserializer : StdDeserializer<List<AgeRatingCategory>>(List::class.java) {
    companion object {
        private val ageRatingCategoryDeserializer = AgeRatingCategoryDeserializer()
    }

    override fun deserialize(p: JsonParser, ctxt: DeserializationContext?): List<AgeRatingCategory> {
        val node = p.codec.readTree<JsonNode>(p)
        return if (node.isArray) {
            node.mapNotNull { ageRatingCategoryDeserializer.deserialize(p.codec.treeAsTokens(it), ctxt) }
        } else {
            emptyList()
        }
    }
}
