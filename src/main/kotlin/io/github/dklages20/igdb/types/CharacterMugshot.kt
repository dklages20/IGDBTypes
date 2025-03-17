package io.github.dklages20.igdb.types

class CharacterMugshot(
    id: Int,
    val alphaChannel: Boolean?,
    val animated: Boolean?,
    val checksum: String?,
    val height: Int?,
    val imageId: String?,
    val url: String?,
    val width: Int?,
): IGDBBaseObject(id)
