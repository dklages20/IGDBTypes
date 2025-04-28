package io.github.dklages20.igdb.types

import com.fasterxml.jackson.annotation.JsonValue

class PlatformWebsite(
    id: Int,
    val category: Category?,
    val checksum: String?,
    val trusted: Boolean?,
    val url: String?
): IGDBBaseObject(id) {
    constructor(id: Int): this(id, null, null, null, null)

    enum class Category(val value: Int) {
        OFFICIAL(1),
        WIKIA(2),
        WIKIPEDIA(3),
        FACEBOOK(4),
        TWITTER(5),
        TWITCH(6),
        INSTAGRAM(8),
        YOUTUBE(9),
        IPHONE(10),
        IPAD(11),
        ANDROID(12),
        STEAM(13),
        REDDIT(14),
        DISCORD(15),
        GOOGLE_PLUS(16),
        TUMBLR(17),
        LINKEDIN(18),
        PINTEREST(19),
        SOUNDCLOUD(20);

        @JsonValue
        fun toValue(): Int = value

        companion object {
            fun fromValue(value: Int): Category? {
                return Category.entries.find { it.value == value }
            }
        }
    }
}