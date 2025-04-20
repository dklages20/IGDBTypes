package io.github.dklages20.igdb.types.deserializers

import io.github.dklages20.igdb.types.Collection

class CollectionDeserializer: IGDBObjectDeserializer<Collection>(Collection::class)
class CollectionListDeserializer: IGDBObjectListDeserializer<Collection>(CollectionDeserializer())