package io.github.dklages20.igdb.types

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.databind.PropertyNamingStrategies
import com.fasterxml.jackson.databind.annotation.JsonNaming

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy::class)
@JsonIgnoreProperties(ignoreUnknown = true)
class AgeRatingContentDescription(
    id: Int,
    val checksum: String?,
    val category: Int?,
    val description: String?,
) : IGDBBaseObject(id) {
    override fun toString(): String {
        return "AgeRatingContentDescription(id=$id, checksum=$checksum, category=$category, description=$description)"
    }
}
