package io.github.dklages20.igdb.types.deserializers

import io.github.dklages20.igdb.types.Cover

class CoverDeserializer : IGDBObjectDeserializer<Cover>(Cover::class)
class CoverListDeserializer: IGDBObjectListDeserializer<Cover>(CoverDeserializer())