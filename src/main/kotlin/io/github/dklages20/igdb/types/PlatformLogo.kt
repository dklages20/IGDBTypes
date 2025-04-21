package io.github.dklages20.igdb.types

class PlatformLogo(
    id: Int,
    val alphaChannel: Boolean?,
    val animated: Boolean?,
    val checksum: String?,
    val height: Int?,
    val imageId: String?,
    val url: String?,
    val width: Int?
): IGDBBaseObject(id) {
    constructor(id: Int): this(id, null, null, null, null, null, null, null)

    override fun toString(): String {
        return "PlatformLogo(id=$id, alphaChannel=$alphaChannel, animated=$animated, checksum=$checksum, height=$height, imageId=$imageId, url=$url, width=$width)"
    }
}