package io.github.dklages20.igdb.types.deserializers

import io.github.dklages20.igdb.types.PlatformLogo

class PlatformLogoDeserializer: IGDBObjectDeserializer<PlatformLogo>(PlatformLogo::class)
class PlatformLogoListDeserializer: IGDBObjectListDeserializer<PlatformLogo>(PlatformLogoDeserializer())