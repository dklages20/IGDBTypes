package io.github.dklages20.igdb.types

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import io.github.dklages20.igdb.types.deserializers.GameDeserializer
import io.github.dklages20.igdb.types.deserializers.LanguageDeserializer
import io.github.dklages20.igdb.types.deserializers.LanguageSupportTypeDeserializer

class LanguageSupport(
    id: Int,
    val checksum: String?,
    val createdAt: Long?,
    @JsonDeserialize(using = GameDeserializer::class)
    val game: Game?,
    @JsonDeserialize(using = LanguageDeserializer::class)
    val language: Language?,
    @JsonDeserialize(using = LanguageSupportTypeDeserializer::class)
    val languageSupportType: LanguageSupportType?,
    val updatedAt: Long?,
): IGDBBaseObject(id) {
    constructor(id: Int): this(id, null, null, null, null, null, null)

    override fun toString(): String {
        return "LanguageSupport(id=$id, checksum=$checksum, createdAt=$createdAt, game=$game, language=$language, languageSupportType=$languageSupportType, updatedAt=$updatedAt)"
    }
}