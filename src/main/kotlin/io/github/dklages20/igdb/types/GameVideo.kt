package io.github.dklages20.igdb.types

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import io.github.dklages20.igdb.types.deserializers.GameDeserializer

class GameVideo(
    id: Int,
    val checksum: String?,
    @JsonDeserialize(using = GameDeserializer::class)
    val game: Game?,
    val name: String?,
    val videoId: String?,
): IGDBBaseObject(id) {
    constructor(id: Int): this(
        id,
        null,
        null,
        null,
        null
    )
}