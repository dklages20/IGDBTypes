package io.github.dklages20.igdb.types

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.databind.PropertyNamingStrategies
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonNaming
import io.github.dklages20.igdb.types.deserializers.GameDeserializer

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy::class)
@JsonIgnoreProperties(ignoreUnknown = true)
class AlternativeName(
    id: Int,
    val comment: String?,
    val checksum: String?,
    @JsonDeserialize(using = GameDeserializer::class)
    val game: Game?,
    val name: String?
) : IGDBBaseObject(id) {
    constructor(id: Int): this(id, null, null, null, null)

    override fun toString(): String {
        return "AlternativeName(id=$id, comment=$comment, checksum=$checksum, game=$game, name=$name)"
    }
}
