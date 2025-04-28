package io.github.dklages20.igdb.types.deserializers

import io.github.dklages20.igdb.types.CollectionType

class CollectionTypeDeserializer : IGDBObjectDeserializer<CollectionType>(CollectionType::class)
class CollectionTypeListDeserializer: IGDBObjectListDeserializer<CollectionType>(CollectionTypeDeserializer())