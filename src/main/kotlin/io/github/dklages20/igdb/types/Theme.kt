package io.github.dklages20.igdb.types

class Theme(
    id: Int,
    val checksum: String?,
    val createdAt: Long?,
    val name: String?,
    val slug: String?,
    val updatedAt: Long?,
    val url: String?,
): IGDBBaseObject(id) {
    constructor(id: Int): this(
        id,
        null,
        null,
        null,
        null,
        null,
        null
    )
}