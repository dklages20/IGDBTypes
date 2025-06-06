package io.github.dklages20.igdb.types.deserializers

import io.github.dklages20.igdb.types.Keyword

class KeywordDeserializer: IGDBObjectDeserializer<Keyword>(Keyword::class)
class KeywordListDeserializer: IGDBObjectListDeserializer<Keyword>(KeywordDeserializer())