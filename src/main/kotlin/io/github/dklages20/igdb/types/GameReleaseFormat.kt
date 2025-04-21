package io.github.dklages20.igdb.types

class GameReleaseFormat(
    id: Int,
    val checksum: String?,
    val createdAt: Long?,
    val format: String?,
    val updatedAt: Long?
): IGDBBaseObject(id) {
    constructor(id: Int): this(id, null, null, null, null)

    override fun toString(): String {
        return "GameReleaseFormat(id=$id, checksum=$checksum, createdAt=$createdAt, format=$format, updatedAt=$updatedAt)"
    }
}