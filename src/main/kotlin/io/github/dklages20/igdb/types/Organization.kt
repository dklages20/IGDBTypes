package io.github.dklages20.igdb.types

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.databind.PropertyNamingStrategies
import com.fasterxml.jackson.databind.annotation.JsonNaming

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy::class)
@JsonIgnoreProperties(ignoreUnknown = true)
class Organization(
    val id: Int,
    val rating: String?,
    val createdAt: Long?,
    val updatedAt: Long?,
    val checksum: String?
) {
    override fun toString(): String {
        return "Organization(id=$id, rating=$rating, createdAt,=$createdAt, updatedAt=$updatedAt, checksum=$checksum)"
    }
}
