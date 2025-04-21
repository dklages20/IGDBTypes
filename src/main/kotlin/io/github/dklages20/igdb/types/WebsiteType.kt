package io.github.dklages20.igdb.types

class WebsiteType(
    id: Int,
    val checksum: String?,
    val createdAt: Long?,
    val type: String?,
    val updatedAt: Long?,
): IGDBBaseObject(id) {

    constructor(id: Int): this(id, null, null, null, null)

    override fun toString(): String {
        return "WebsiteType(id=$id, checksum=$checksum, createdAt=$createdAt, type=$type, updatedAt=$updatedAt)"
    }
}