package io.github.dklages20.igdb.types.deserializers

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.*
import com.fasterxml.jackson.databind.deser.std.StdDeserializer
import io.github.dklages20.igdb.types.AgeRatingContentDescription

class AgeRatingContentDescriptionDeserializer: StdDeserializer<List<AgeRatingContentDescription>>(List::class.java) {
    override fun deserialize(p: JsonParser, ctxt: DeserializationContext?): List<AgeRatingContentDescription> {
        val node = p.codec.readTree<JsonNode>(p)
        return if(node.isArray) {
            node.mapNotNull {
                when {
                    it.isInt -> AgeRatingContentDescription(it.asInt(), null, null, null)
                    it.isObject -> p.codec.treeToValue(it, AgeRatingContentDescription::class.java)
                    else -> throw Exception("Received unexpected value for ${AgeRatingContentDescription::class}")
                }
            }
        } else {
            emptyList()
        }
    }
}
