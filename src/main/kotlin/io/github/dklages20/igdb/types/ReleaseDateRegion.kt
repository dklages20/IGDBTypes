package io.github.dklages20.igdb.types

class ReleaseDateRegion(
    id: Int,
    val checksum: String?,
    val createdAt: Long?,
    val region: String?,
    val updatedAt: Long?
): IGDBBaseObject(id) {

    constructor(id: Int): this(id, null, null, null, null)

    override fun toString(): String {
        return "ReleaseDateRegion(id=$id, checksum=$checksum, createdAt=$createdAt, region=$region, updatedAt=$updatedAt)"
    }
}