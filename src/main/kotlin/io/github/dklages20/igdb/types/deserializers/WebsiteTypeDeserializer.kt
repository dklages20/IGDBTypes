package io.github.dklages20.igdb.types.deserializers

import io.github.dklages20.igdb.types.WebsiteType

class WebsiteTypeDeserializer: IGDBObjectDeserializer<WebsiteType>(WebsiteType::class)
class WebsiteTypeListDeserializer: IGDBObjectListDeserializer<WebsiteType>(WebsiteTypeDeserializer())