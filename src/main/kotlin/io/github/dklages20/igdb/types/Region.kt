package io.github.dklages20.igdb.types

class Region(
    id: Int,
    val category: String?,
    val checksum: String?,
    val createdAt: Long?,
    val identifier: String?,
    val name: String?,
    val updatedAt: Long?,
    ): IGDBBaseObject(id) {
        constructor(id: Int): this(id, null, null, null, null, null, null)
}
