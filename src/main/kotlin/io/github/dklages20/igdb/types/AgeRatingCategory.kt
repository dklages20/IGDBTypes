package io.github.dklages20.igdb.types

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.databind.PropertyNamingStrategies
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonNaming
import io.github.dklages20.igdb.types.deserializers.OrganizationDeserializer

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy::class)
@JsonIgnoreProperties(ignoreUnknown = true)
class AgeRatingCategory(
    val id: Int,
    val rating: String?,
    @JsonDeserialize(using = OrganizationDeserializer::class)
    val organization: AgeRatingOrganization?,
    val createdAt: Long?,
    val updatedAt: Long?,
    val checksum: String?
)
