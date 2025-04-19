package io.github.dklages20.igdb.types

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import io.github.dklages20.igdb.types.deserializers.CollectionTypeDeserializer

class CollectionRelationType(
    id: Int,
    @JsonDeserialize(using = CollectionTypeDeserializer::class)
    val allowedChildType: CollectionType?,
    @JsonDeserialize(using = CollectionTypeDeserializer::class)
    val allowedParentType: CollectionType?,
    val checksum: String?,
    val createdAt: Long?,
    val description: String?,
    val name: String?,
    val updatedAt: Long?
): IGDBBaseObject(id) {
    constructor(id: Int) : this(id, null, null, null, null, null, null, null)
}
