package io.github.dklages20.igdb.types

class CollectionType(
    id: Int,
    val checksum: String?,
    val createdAt: Long?,
    val description: String?,
    val name: String?,
    val updatedAt: Long?
): IGDBBaseObject(id) {
    constructor(id: Int): this(id, null, null, null, null, null)
}
