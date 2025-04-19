package io.github.dklages20.igdb.types

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import io.github.dklages20.igdb.types.deserializers.CollectionRelationListDeserializer
import io.github.dklages20.igdb.types.deserializers.CollectionTypeDeserializer
import io.github.dklages20.igdb.types.deserializers.GameListDeserializer

class Collection(
    id: Int,
    @JsonDeserialize(using = CollectionRelationListDeserializer::class)
    val asChildRelations: List<CollectionRelation> = listOf(),
    @JsonDeserialize(using = CollectionRelationListDeserializer::class)
    val asParentRelations: List<CollectionRelation> = listOf(),
    val checksum: String?,
    val createdAt: Long?,
    @JsonDeserialize(using = GameListDeserializer::class)
    val games: List<Game> = listOf(),
    val name: String?,
    val slug: String?,
    @JsonDeserialize(using = CollectionTypeDeserializer::class)
    val type: CollectionType?,
    val updatedAt: Long?,
    val url: String?
): IGDBBaseObject (id) {
    constructor(id: Int): this(id, listOf(), listOf(), null, null, listOf(), null, null, null, null, null)
}
