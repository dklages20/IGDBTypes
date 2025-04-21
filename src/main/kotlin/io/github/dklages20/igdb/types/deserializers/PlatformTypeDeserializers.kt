package io.github.dklages20.igdb.types.deserializers

import io.github.dklages20.igdb.types.PlatformType

class PlatformTypeDeserializer: IGDBObjectDeserializer<PlatformType>(PlatformType::class)
class PlatformTypeListDeserializer: IGDBObjectListDeserializer<PlatformType>(PlatformTypeDeserializer())