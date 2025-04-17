package io.github.dklages20.igdb.types

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import io.github.dklages20.igdb.types.deserializers.GameDeserializer
import io.github.dklages20.igdb.types.deserializers.GameLocalizationDeserializer

class Cover(
    id: Int,
    val alphaChannel: Boolean?,
    val animated: Boolean?,
    val checksum: String?,
    @JsonDeserialize(using = GameDeserializer::class)
    val game: Game?,
    @JsonDeserialize(using = GameLocalizationDeserializer::class)
    val gameLocalization: GameLocalization?,
    val height: Int?,
    val imageId: String?,
    val url: String?,
    val width: Int?
): IGDBBaseObject(id) {
    constructor(id: Int): this(id, null, null, null, null, null, null, null, null, null)
}
