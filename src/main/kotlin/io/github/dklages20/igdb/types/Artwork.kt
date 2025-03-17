package io.github.dklages20.igdb.types

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.databind.PropertyNamingStrategies
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonNaming
import io.github.dklages20.igdb.types.deserializers.GameDeserializer

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy::class)
@JsonIgnoreProperties(ignoreUnknown = true)
class Artwork(
    id: Int,
    val alphaChannel: Boolean?,
    val animated: Boolean?,
    val checksum: String?,
    @JsonDeserialize(using = GameDeserializer::class)
    val game: Game?,
    val height: Int?,
    val imageId: String?,
    val url: String?,
    val width: Int?,
): IGDBBaseObject(id)
