package io.github.dklages20.igdb.types

import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import io.github.dklages20.igdb.types.deserializers.CharacterGenderDeserializer
import io.github.dklages20.igdb.types.deserializers.CharacterMugshotDeserializer
import io.github.dklages20.igdb.types.deserializers.CharacterSpecieDeserializer
import io.github.dklages20.igdb.types.deserializers.GameListDeserializer

class Character(
    id: Int,
    val akas: List<String>?,
    @JsonDeserialize(using = CharacterGenderDeserializer::class)
    val characterGender: CharacterGender?,
    @JsonDeserialize(using = CharacterSpecieDeserializer::class)
    val characterSpecies: CharacterSpecie?,
    val checksum: String?,
    val countryName: String?,
    val createdAt: Long?,
    val description: String?,
    @JsonDeserialize(using = GameListDeserializer::class)
    val games: List<Game>?,
    @Deprecated("This field has been deprecated by the IGDB API. Use 'characterGender' instead.")
    val gender: Gender?,
    @JsonDeserialize(using = CharacterMugshotDeserializer::class)
    val mugShot: CharacterMugshot?,
    val name: String?,
    val slug: String?,
    @Deprecated("This field has been deprecated by the IGDB API. Use 'characterSpecies' instead.")
    val species: Species?,
    val updatedAt: Long?,
    val url: String?
): IGDBBaseObject(id) {
    enum class Gender(val value: Int) {
        MALE(0),
        FEMALE(1),
        OTHER(2);

        @JsonValue
        fun toValue(): Int = value

        companion object {
            fun fromValue(value: Int): Gender? {
                return Gender.entries.find { it.value == value }
            }
        }
    }

    enum class Species(val value: Int) {
        HUMAN(1),
        ALIEN(2),
        ANIMAL(3),
        ANDROID(4),
        OTHER(5);

        @JsonValue
        fun toValue(): Int = value

        companion object {
            fun fromValue(value: Int): Species? {
                return Species.entries.find { it.value == value }
            }
        }
    }
}
