package io.github.dklages20.igdb.types

import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import io.github.dklages20.igdb.types.deserializers.GameDeserializer
import io.github.dklages20.igdb.types.deserializers.WebsiteTypeDeserializer

class Website(
    id: Int,
    val category: Category?,
    val checksum: String?,
    @JsonDeserialize(using = GameDeserializer::class)
    val game: Game?,
    val trusted: Boolean?,
    @JsonDeserialize(using = WebsiteTypeDeserializer::class)
    val type: WebsiteType?,
    val url: String?
): IGDBBaseObject(id) {
    constructor(id: Int): this(
        id,
        null,
        null,
        null,
        null,
        null,
        null
    )

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
        ITCH(15),
        EPIC_GAMES(16),
        GOG(17),
        DISCORD(18),
        BLUESKY(19);

        @JsonValue
        fun toValue(): Int {
            return value
        }

        companion object {
            fun fromValue(value: Int): Category? {
                return Category.entries.find { it.value == value }
            }
        }
    }
}