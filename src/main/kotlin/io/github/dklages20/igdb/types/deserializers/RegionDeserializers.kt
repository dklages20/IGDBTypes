package io.github.dklages20.igdb.types.deserializers

import io.github.dklages20.igdb.types.Region

class RegionDeserializer: IGDBObjectDeserializer<Region>(Region::class)
class RegionListDeserializer: IGDBObjectListDeserializer<Region>(RegionDeserializer())