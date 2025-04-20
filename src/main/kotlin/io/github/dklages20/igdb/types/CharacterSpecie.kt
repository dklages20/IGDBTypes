package io.github.dklages20.igdb.types

class CharacterSpecie(
    id: Int,
    val checksum: String?,
    val createdAt: Long?,
    val updatedAt: Long?,
    val name: String?
): IGDBBaseObject(id) {
    constructor(id: Int): this(id, null, null, null, null)

    override fun toString(): String {
        return "CharacterSpecie(id=$id, checksum=$checksum, createdAt=$createdAt, updatedAt=$updatedAt, name=$name)"
    }
}
