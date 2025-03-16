package io.github.dklages20.igdb.types.deserializers

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.deser.std.StdDeserializer
import io.github.dklages20.igdb.types.AgeRatingContentDescription

class AgeRatingContentDescriptionDeserializer: StdDeserializer<AgeRatingContentDescription>(List::class.java) {
    override fun deserialize(p: JsonParser, ctxt: DeserializationContext?): AgeRatingContentDescription {
        val node = p.codec.readTree<JsonNode>(p)
        return when {
            node.isInt -> AgeRatingContentDescription(node.asInt(), null, null, null)
            node.isObject -> p.codec.treeToValue(node, AgeRatingContentDescription::class.java)
            else -> throw Exception("Received unexpected value for ${AgeRatingContentDescription::class}")
        }
    }
}

class AgeRatingContentDescriptionListDeserializer: StdDeserializer<List<AgeRatingContentDescription>>(List::class.java) {
    companion object {
        private val ageRatingContentDescriptionDeserializer = AgeRatingContentDescriptionDeserializer()
    }

    override fun deserialize(p: JsonParser, ctxt: DeserializationContext?): List<AgeRatingContentDescription> {
        val node = p.codec.readTree<JsonNode>(p)
        return if (node.isArray) {
            node.mapNotNull { ageRatingContentDescriptionDeserializer.deserialize(p.codec.treeAsTokens(it), ctxt) }
        } else {
            emptyList()
        }
    }
}
