package io.github.dklages20.igdb.types

class PlayerPerspective(
    id: Int,
    val checksum: String?,
    val createdAt: Long?,
    val name: String?,
    val slug: String?,
    val updatedAt: Long?,
    val url: String?,
): IGDBBaseObject(id) {
    constructor(id: Int): this(id, null, null, null, null, null, null)

    override fun toString(): String {
        return "PlayerPerspective(id=$id, checksum=$checksum, createdAt=$createdAt, name=$name, slug=$slug, updatedAt=$updatedAt, url=$url)"
    }
}