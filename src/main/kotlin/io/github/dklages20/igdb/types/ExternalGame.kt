package io.github.dklages20.igdb.types

import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import io.github.dklages20.igdb.types.deserializers.ExternalGameSourceDeserializer
import io.github.dklages20.igdb.types.deserializers.GameDeserializer
import io.github.dklages20.igdb.types.deserializers.GameReleaseFormatDeserializer
import io.github.dklages20.igdb.types.deserializers.PlatformDeserializer

class ExternalGame(
    id: Int,
    val category: Category?,
    val checksum: String?,
    val countries: List<Int>?,
    val createdAt: Long?,
    @JsonDeserialize(using = ExternalGameSourceDeserializer::class)
    val externalGameSource: ExternalGameSource?,
    @JsonDeserialize(using = GameDeserializer::class)
    val game: Game?,
    @JsonDeserialize(using = GameReleaseFormatDeserializer::class)
    val gameReleaseFormat: GameReleaseFormat?,
    val media: Media?,
    val name: String?,
    @JsonDeserialize(using = PlatformDeserializer::class)
    val platform: Platform?,
    val uid: String?,
    val updatedAt: Long?,
    val url: String?,
    val year: Int?
): IGDBBaseObject(id) {
    enum class Category(val value: Int) {
        STEAM(1),
        GOG(5),
        YOUTUBE(10),
        MICROSOFT(11),
        APPLE(13),
        TWITCH(14),
        ANDROID(15),
        AMAZON_ASIN(20),
        AMAZON_LUNA(22),
        AMAZON_ADG(23),
        EPIC_GAME_STORE(26),
        OCULUS(28),
        UTOMIK(29),
        ITCH_IO(30),
        XBOX_MARKETPLACE(31),
        KARTRIDGE(32),
        PLAYSTATION_STORE_US(36),
        FOCUS_ENTERTAINMENT(37),
        XBOX_GAME_PASS_ULTIMATE_CLOUD(54),
        GAMEJOLT(55);

        @JsonValue
        fun toValue(): Int = value

        companion object {
            fun fromValue(value: Int): Category? {
                return Category.entries.find { it.value == value }
            }
        }
    }

    enum class Media(val value: Int) {
        DIGITAL(1),
        PHYSICAL(2);

        @JsonValue
        fun toValue(): Int = value

        companion object {
            fun fromValue(value: Int): Media? {
                return Media.entries.find { it.value == value }
            }
        }
    }
}