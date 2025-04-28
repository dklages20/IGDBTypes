package io.github.dklages20.igdb.types

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.databind.PropertyNamingStrategies
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonNaming
import io.github.dklages20.igdb.types.deserializers.AgeRatingOrganizationDeserializer

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy::class)
@JsonIgnoreProperties(ignoreUnknown = true)
class AgeRatingCategory(
    id: Int,
    val rating: String?,
    @JsonDeserialize(using = AgeRatingOrganizationDeserializer::class)
    val organization: AgeRatingOrganization?,
    val createdAt: Long?,
    val updatedAt: Long?,
    val checksum: String?
): IGDBBaseObject(id) {
    constructor(id: Int): this(id, null, null, null, null, null)
}
