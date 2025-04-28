package io.github.dklages20.igdb.types.deserializers

import io.github.dklages20.igdb.types.PlatformFamily

class PlatformFamilyDeserializer: IGDBObjectDeserializer<PlatformFamily>(PlatformFamily::class)
class PlatformFamilyListDeserializer: IGDBObjectListDeserializer<PlatformFamily>(PlatformFamilyDeserializer())