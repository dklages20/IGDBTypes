package io.github.dklages20.igdb.types.deserializers

import io.github.dklages20.igdb.types.PlatformVersion

class PlatformVersionDeserializer: IGDBObjectDeserializer<PlatformVersion>(PlatformVersion::class)
class PlatformVersionListDeserializer: IGDBObjectListDeserializer<PlatformVersion>(PlatformVersionDeserializer())