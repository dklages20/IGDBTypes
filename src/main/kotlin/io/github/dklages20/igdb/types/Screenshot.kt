package io.github.dklages20.igdb.types

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import io.github.dklages20.igdb.types.deserializers.GameDeserializer

class Screenshot(
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
): IGDBBaseObject(id) {
    constructor(id: Int): this(id, null, null, null, null, null, null, null, null)
}