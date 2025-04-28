package io.github.dklages20.igdb.types.deserializers

import io.github.dklages20.igdb.types.ReleaseDateRegion

class ReleaseDateRegionDeserializer: IGDBObjectDeserializer<ReleaseDateRegion>(ReleaseDateRegion::class)
class ReleaseDateRegionListDeserializer: IGDBObjectListDeserializer<ReleaseDateRegion>(ReleaseDateRegionDeserializer())