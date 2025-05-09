package io.github.dklages20.igdb.types

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.databind.PropertyNamingStrategies
import com.fasterxml.jackson.databind.annotation.JsonNaming

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy::class)
@JsonIgnoreProperties(ignoreUnknown = true)
class CharacterGender(
    id: Int,
    val checksum: String?,
    val name: String?,
    val createdAt: Long?,
    val updatedAt: Long?,
): IGDBBaseObject(id) {
    constructor(id: Int): this(id, null, null, null, null)

    override fun toString(): String {
        return "CharacterGender(id=$id, checksum=$checksum, name=$name, createdAt=$createdAt, updatedAt=$updatedAt)"
    }
}
