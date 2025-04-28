package io.github.dklages20.igdb.types

class PlatformFamily(
    id: Int,
    val checksum: String?,
    val name: String?,
    val slug: String?
): IGDBBaseObject(id) {
    constructor(id: Int): this(id, null, null, null)

    override fun toString(): String {
        return "PlatformFamily(id=$id, checksum=$checksum, name=$name, slug=$slug)"
    }
}