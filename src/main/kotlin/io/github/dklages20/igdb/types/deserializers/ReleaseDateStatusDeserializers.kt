package io.github.dklages20.igdb.types.deserializers

import io.github.dklages20.igdb.types.ReleaseDateStatus

class ReleaseDateStatusDeserializer: IGDBObjectDeserializer<ReleaseDateStatus>(ReleaseDateStatus::class)
class ReleaseDateStatusListDeserializer: IGDBObjectListDeserializer<ReleaseDateStatus>(ReleaseDateStatusDeserializer())