package io.github.dklages20.igdb.types

class GameStatus(
    id: Int,
    val checksum: String?,
    val createdAt: Long?,
    val status: String?,
    val updatedAt: Long?
): IGDBBaseObject(id) {

    constructor(id: Int): this(id, null, null, null, null)

    override fun toString(): String {
        return "GameStatus(id=$id, checksum=$checksum, createdAt=$createdAt, status=$status, updatedAt=$updatedAt)"
    }
}