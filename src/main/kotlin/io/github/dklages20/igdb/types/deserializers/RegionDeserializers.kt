package io.github.dklages20.igdb.types.deserializers

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.deser.std.StdDeserializer
import io.github.dklages20.igdb.types.Region

class RegionDeserializer : StdDeserializer<Region>(List::class.java) {
    override fun deserialize(p: JsonParser, ctxt: DeserializationContext?): Region {
        val node = p.codec.readTree<JsonNode>(p)
        return when {
            node.isInt -> Region(node.asInt())
            node.isObject -> p.codec.treeToValue(node, Region::class.java)
            else -> throw Exception("Received unexpected value for ${Region::class}")
        }
    }
}

class RegionListDeserializer: StdDeserializer<List<Region>>(List::class.java) {
    companion object {
        private val regionDeserializer = RegionDeserializer()
    }

    override fun deserialize(p: JsonParser, ctxt: DeserializationContext?): List<Region> {
        val node = p.codec.readTree<JsonNode>(p)
        return if (node.isArray) {
            node.mapNotNull { regionDeserializer.deserialize(p.codec.treeAsTokens(it), ctxt) }
        } else {
            emptyList()
        }
    }
}
