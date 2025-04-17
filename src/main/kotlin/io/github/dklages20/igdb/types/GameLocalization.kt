package io.github.dklages20.igdb.types

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import io.github.dklages20.igdb.types.deserializers.CoverDeserializer
import io.github.dklages20.igdb.types.deserializers.GameDeserializer
import io.github.dklages20.igdb.types.deserializers.RegionDeserializer

class GameLocalization(
    id: Int,
    val checksum: String?,
    @JsonDeserialize(using = CoverDeserializer::class)
    val cover: Cover?,
    val createdAt: Long?,
    @JsonDeserialize(using = GameDeserializer::class)
    val game: Game?,
    val name: String?,
    @JsonDeserialize(using = RegionDeserializer::class)
    val region: Region?,
    val updatedAt: Long?,
): IGDBBaseObject(id) {
    constructor(id: Int): this(id, null, null, null, null, null, null, null)
}
