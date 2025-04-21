package io.github.dklages20.igdb.types.deserializers

import io.github.dklages20.igdb.types.Platform

class PlatformDeserializer: IGDBObjectDeserializer<Platform>(Platform::class)
class PlatformListDeserializer: IGDBObjectListDeserializer<Platform>(PlatformDeserializer())