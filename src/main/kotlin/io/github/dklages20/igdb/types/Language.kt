package io.github.dklages20.igdb.types

class Language(
    id: Int,
    val checksum: String?,
    val createdAt: Long?,
    val locale: String?,
    val name: String?,
    val nativeName: String?,
    val updatedAt: Long?,
): IGDBBaseObject(id) {
    constructor(id: Int): this(id, null, null, null, null, null, null)

    override fun toString(): String {
        return "Language(id=$id, checksum=$checksum, createdAt=$createdAt, locale=$locale, name=$name, nativeName=$nativeName, updatedAt=$updatedAt)"
    }
}