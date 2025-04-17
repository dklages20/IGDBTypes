package io.github.dklages20.igdb.types

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import io.github.dklages20.igdb.types.deserializers.CollectionTypeDeserializer

class CollectionMembershipType(
    id: Int,
    @JsonDeserialize(using = CollectionTypeDeserializer::class)
    val allowedCollectionType: CollectionType?,
    val checksum: String?,
    val createdAt: Long?,
    val description: String?,
    val name: String?,
    val updatedAt: Long?
) : IGDBBaseObject(id) {
    constructor(id: Int): this(id, null, null, null, null, null, null)
}
