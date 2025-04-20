package io.github.dklages20.igdb.types.deserializers

import io.github.dklages20.igdb.types.Artwork

class ArtworkDeserializer: IGDBObjectDeserializer<Artwork>(Artwork::class)
class ArtworkListDeserializer: IGDBObjectListDeserializer<Artwork>(ArtworkDeserializer())