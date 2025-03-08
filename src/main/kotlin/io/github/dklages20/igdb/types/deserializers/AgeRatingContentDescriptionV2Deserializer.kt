package io.github.dklages20.igdb.types.deserializers

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.deser.std.StdDeserializer
import io.github.dklages20.igdb.types.AgeRatingContentDescriptionV2

class AgeRatingContentDescriptionV2Deserializer: StdDeserializer<List<AgeRatingContentDescriptionV2>>(List::class.java) {
    override fun deserialize(p: JsonParser, ctxt: DeserializationContext?): List<AgeRatingContentDescriptionV2> {
        val node = p.codec.readTree<JsonNode>(p)
        return if(node.isArray) {
            node.mapNotNull {
                when {
                    it.isInt -> AgeRatingContentDescriptionV2(it.asInt(), null, null, null, null, null)
                    it.isObject -> p.codec.treeToValue(it, AgeRatingContentDescriptionV2::class.java)
                    else -> throw Exception("Received unexpected value for ${AgeRatingContentDescriptionV2::class}")
                }
            }
        } else {
            emptyList()
        }
    }
}
