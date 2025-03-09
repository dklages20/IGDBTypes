package io.github.dklages20.igdb.types

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.databind.PropertyNamingStrategies
import com.fasterxml.jackson.databind.annotation.JsonNaming

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy::class)
@JsonIgnoreProperties(ignoreUnknown = true)
class AgeRatingOrganization(
    val id: Int,
    val name: String?,
    val createdAt: Long?,
    val updatedAt: Long?,
    val checksum: String?
) {
    override fun toString(): String {
        return "AgeRatingOrganization(id=$id, name=$name createdAt,=$createdAt, updatedAt=$updatedAt, checksum=$checksum)"
    }
}
