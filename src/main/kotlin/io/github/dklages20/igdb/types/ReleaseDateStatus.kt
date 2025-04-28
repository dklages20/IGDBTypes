package io.github.dklages20.igdb.types

class ReleaseDateStatus(
    id: Int,
    val checksum: String?,
    val createdAt: Long?,
    val description: String?,
    val name: String?,
    val updatedAt: Long?,
): IGDBBaseObject(id) {
    constructor(id: Int): this(id, null, null, null, null, null)

    override fun toString(): String {
        return "ReleaseDateStatus(id=$id, checksum=$checksum, createdAt=$createdAt, description=$description, name=$name, updatedAt=$updatedAt)"
    }
}