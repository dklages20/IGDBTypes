package io.github.dklages20.igdb.types

class CharacterSpecie(
    id: Int,
    val checksum: String?,
    val createdAt: Long?,
    val updatedAt: Long?,
    val name: String?
): IGDBBaseObject(id)
