package io.github.dklages20.igdb.types

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import io.github.dklages20.igdb.types.deserializers.GameListDeserializer

class Franchise(
    id: Int,
    val checksum: String?,
    val createdAt: Long?,
    @JsonDeserialize(using = GameListDeserializer::class)
    val games: List<Game>?,
    val name: String?,
    val slug: String?,
    val updatedAt: Long?,
    val url: String?,
): IGDBBaseObject(id) {
    constructor(id: Int): this(id, null, null, null, null, null, null, null)

    override fun toString(): String {
        return "Franchise(id=$id, checksum=$checksum, createdAt=$createdAt, games=$games, name=$name, slug=$slug, updatedAt=$updatedAt, url=$url)"
    }
}