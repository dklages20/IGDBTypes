package io.github.dklages20.igdb.types.deserializers

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.deser.std.StdDeserializer
import io.github.dklages20.igdb.types.AgeRatingContentDescriptionV2

class AgeRatingContentDescriptionV2Deserializer: StdDeserializer<AgeRatingContentDescriptionV2>(List::class.java) {
    override fun deserialize(p: JsonParser, ctxt: DeserializationContext?): AgeRatingContentDescriptionV2 {
        val node = p.codec.readTree<JsonNode>(p)
        return when {
            node.isInt -> AgeRatingContentDescriptionV2(node.asInt(), null, null, null, null, null)
            node.isObject -> p.codec.treeToValue(node, AgeRatingContentDescriptionV2::class.java)
            else -> throw Exception("Received unexpected value for ${AgeRatingContentDescriptionV2::class}")
        }
    }
}

class AgeRatingContentDescriptionV2ListDeserializer: StdDeserializer<List<AgeRatingContentDescriptionV2>>(List::class.java) {
    companion object {
        private val ageRatingContentDescriptionV2Deserializer = AgeRatingContentDescriptionV2Deserializer()
    }

    override fun deserialize(p: JsonParser, ctxt: DeserializationContext?): List<AgeRatingContentDescriptionV2> {
        val node = p.codec.readTree<JsonNode>(p)
        return if(node.isArray) {
            node.mapNotNull { ageRatingContentDescriptionV2Deserializer.deserialize(p.codec.treeAsTokens(it), ctxt) }
        } else {
            emptyList()
        }
    }
}

