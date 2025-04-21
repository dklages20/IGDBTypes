package io.github.dklages20.igdb.types

import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import io.github.dklages20.igdb.types.deserializers.PlatformFamilyDeserializer
import io.github.dklages20.igdb.types.deserializers.PlatformLogoDeserializer
import io.github.dklages20.igdb.types.deserializers.PlatformTypeDeserializer
import io.github.dklages20.igdb.types.deserializers.PlatformVersionListDeserializer
import io.github.dklages20.igdb.types.deserializers.PlatformWebsiteListDeserializer

class Platform(
    id: Int,
    val abbreviation: String?,
    val alternativeName: String?,
    val category: Category?,
    val checksum: String?,
    val createdAt: Long?,
    val generation: Int?,
    val name: String?,
    @JsonDeserialize(using = PlatformLogoDeserializer::class)
    val platformLogo: PlatformLogo?,
    @JsonDeserialize(using = PlatformFamilyDeserializer::class)
    val platformFamily: PlatformFamily?,
    @JsonDeserialize(using = PlatformTypeDeserializer::class)
    val platformType: PlatformType?,
    val slug: String?,
    val summary: String?,
    val updatedAt: Long?,
    val url: String?,
    @JsonDeserialize(using = PlatformVersionListDeserializer::class)
    val versions: List<PlatformVersion>?,
    @JsonDeserialize(using = PlatformWebsiteListDeserializer::class)
    val websites: List<PlatformWebsite>?
): IGDBBaseObject(id) {
    enum class Category(val value: Int) {
        CONSOLE(1),
        ARCADE(2),
        PLATFORM(3),
        OPERATING_SYSTEM(4),
        PORTABLE_CONSOLE(5),
        COMPUTER(6);

        @JsonValue
        fun toValue(): Int = value

        companion object {
            fun fromValue(value: Int): Category? {
                return Category.entries.find { it.value == value }
            }
        }
    }
}