package io.github.dklages20.igdb.types

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.databind.PropertyNamingStrategies
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonNaming
import io.github.dklages20.igdb.types.deserializers.AgeRatingOrganizationDeserializer

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy::class)
@JsonIgnoreProperties(ignoreUnknown = true)
class AgeRatingContentDescriptionV2(
    id: Int,
    val checksum: String?,
    val createdAt: Long?,
    val updatedAt: Long?,
    val description: String?,
    @JsonDeserialize(using = AgeRatingOrganizationDeserializer::class)
    val organization: AgeRatingOrganization?,
) : IGDBBaseObject(id) {
    override fun toString(): String {
        return "AgeRatingContentDescriptionV2(id=$id, checksum=$checksum, createdAt=$createdAt, updatedAt=$updatedAt, description=$description, organization=$organization)"
    }
}
