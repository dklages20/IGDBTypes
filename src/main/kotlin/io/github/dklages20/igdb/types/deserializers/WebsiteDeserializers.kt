package io.github.dklages20.igdb.types.deserializers

import io.github.dklages20.igdb.types.Website

class WebsiteDeserializer: IGDBObjectDeserializer<Website>(Website::class)
class WebsiteListDeserializer : IGDBObjectListDeserializer<Website>(WebsiteDeserializer())