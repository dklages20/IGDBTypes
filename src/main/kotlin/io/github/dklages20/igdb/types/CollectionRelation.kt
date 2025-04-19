package io.github.dklages20.igdb.types

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import io.github.dklages20.igdb.types.deserializers.CollectionDeserializer
import io.github.dklages20.igdb.types.deserializers.CollectionRelationTypeDeserializer

class CollectionRelation(
    id: Int,
    val checksum: String?,
    @JsonDeserialize(using = CollectionDeserializer::class)
    val childCollection: Collection?,
    val createdAt: Long?,
    @JsonDeserialize(using = CollectionDeserializer::class)
    val parentCollection: Collection?,
    @JsonDeserialize(using = CollectionRelationTypeDeserializer::class)
    val type: CollectionRelationType?,
    val updatedAt: Long?
): IGDBBaseObject(id) {
    constructor(id: Int): this(id, null, null, null, null, null, null)
}
