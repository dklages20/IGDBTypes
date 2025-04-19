package io.github.dklages20.igdb.types

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import io.github.dklages20.igdb.types.deserializers.CollectionDeserializer
import io.github.dklages20.igdb.types.deserializers.CollectionMembershipTypeDeserializer
import io.github.dklages20.igdb.types.deserializers.GameDeserializer

class CollectionMembership(
    id: Int,
    val checksum: String?,
    @JsonDeserialize(using = CollectionDeserializer::class)
    val collection: Collection?,
    val createdAt: Long?,
    @JsonDeserialize(using = GameDeserializer::class)
    val game: Game?,
    @JsonDeserialize(using = CollectionMembershipTypeDeserializer::class)
    val type: CollectionMembershipType?,
    val updatedAt: Long?,
): IGDBBaseObject(id) {
    constructor(id: Int): this(id, null, null, null, null, null, null)
}
