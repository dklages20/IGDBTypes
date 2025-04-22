package io.github.dklages20.igdb.types

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import io.github.dklages20.igdb.types.deserializers.GameDeserializer
import io.github.dklages20.igdb.types.deserializers.PlatformDeserializer

class MultiplayerMode(
    id: Int,
    val campaigncoop: Boolean?,
    val checksum: String?,
    val dropin: Boolean?,
    @JsonDeserialize(using = GameDeserializer::class)
    val game: Game?,
    val lancoop: Boolean?,
    val offlinecoop: Boolean?,
    val offlinecoopmax: Int?,
    val onlinecoop: Boolean?,
    val onlinecoopmax: Int?,
    val onlinemax: Int?,
    @JsonDeserialize(using = PlatformDeserializer::class)
    val platform: Platform?,
    val splitscreen: Boolean?,
    val splitscreenonline: Boolean?,
): IGDBBaseObject(id) {
    constructor(id: Int) : this(id, null, null, null, null, null, null, null, null, null, null, null, null, null)
}
