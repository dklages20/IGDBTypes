package io.github.dklages20.igdb.types.deserializers

import io.github.dklages20.igdb.types.ReleaseDate

class ReleaseDateDeserializer: IGDBObjectDeserializer<ReleaseDate>(ReleaseDate::class)
class ReleaseDateListDeserializer: IGDBObjectListDeserializer<ReleaseDate>(ReleaseDateDeserializer())