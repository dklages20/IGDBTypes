package io.github.dklages20.igdb.types

class PlatformVersion(
    id: Int,
    val checksum: String?,
    val companies: List<PlatformVersionCompany>?,
    val connectivity: String?,
    val cpu: String?,
    val graphics: String?,
    val mainManufacturer: PlatformVersionCompany?,
    val media: String?,
    val memory: String?,
    val name: String?,
    val os: String?,
    val output: String?,
    val platformLogo: PlatformLogo?,
    val platformVersionReleaseDates: List<PlatformVersionReleaseDate>?,
    val resolutions: String?,
    val slug: String?,
    val sound: String?,
    val storage: String?,
    val summary: String?,
    val url: String?,
): IGDBBaseObject(id) {

    constructor(id: Int): this(id, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null)

    override fun toString(): String {
        return "PlatformVersion(id=$id, checksum=$checksum, companies=$companies, connectivity=$connectivity, cpu=$cpu, graphics=$graphics, mainManufacturer=$mainManufacturer, media=$media, memory=$memory, name=$name, os=$os, output=$output, platformLogo=$platformLogo, platformVersionReleaseDates=$platformVersionReleaseDates, resolutions=$resolutions, slug=$slug, sound=$sound, storage=$storage, summary=$summary, url=$url)"
    }
}