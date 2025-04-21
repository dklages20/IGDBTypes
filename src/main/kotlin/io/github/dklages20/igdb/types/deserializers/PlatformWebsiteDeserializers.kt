package io.github.dklages20.igdb.types.deserializers

import io.github.dklages20.igdb.types.PlatformWebsite

class PlatformWebsiteDeserializer: IGDBObjectDeserializer<PlatformWebsite>(PlatformWebsite::class)
class PlatformWebsiteListDeserializer: IGDBObjectListDeserializer<PlatformWebsite>(PlatformWebsiteDeserializer())