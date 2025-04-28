package io.github.dklages20.igdb.types.deserializers

import io.github.dklages20.igdb.types.CollectionRelation

class CollectionRelationDeserializer : IGDBObjectDeserializer<CollectionRelation>(CollectionRelation::class)
class CollectionRelationListDeserializer : IGDBObjectListDeserializer<CollectionRelation>(CollectionRelationDeserializer())