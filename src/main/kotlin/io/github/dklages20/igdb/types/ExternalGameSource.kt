package io.github.dklages20.igdb.types

class ExternalGameSource(
    id: Int,
    val checksum: String?,
    val createdAt: Long?,
    val name: String?,
    val updatedAt: Long?
): IGDBBaseObject(id) {
    constructor(id: Int): this(id, null, null, null, null)

    override fun toString(): String {
        return "ExternalGameSource(id=$id, checksum=$checksum, createdAt=$createdAt, name=$name, updatedAt=$updatedAt)"
    }
}