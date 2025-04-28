package io.github.dklages20.igdb.types

class PlatformVersionCompany(
    id: Int,
    val checksum: String?,
    val comment: String?,
    val company: Company?,
    val developer: Boolean?,
    val manufacturer:  Boolean?,
): IGDBBaseObject(id) {
    constructor(id: Int): this(id, null, null, null, null, null)

    override fun toString(): String {
        return "PlatformVersionCompany(id=$id, checksum=$checksum, comment=$comment, company=$company, developer=$developer, manufacturer=$manufacturer)"
    }
}