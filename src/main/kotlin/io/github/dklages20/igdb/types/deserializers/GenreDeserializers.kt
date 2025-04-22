package io.github.dklages20.igdb.types.deserializers

import io.github.dklages20.igdb.types.Genre

class GenreDeserializer: IGDBObjectDeserializer<Genre>(Genre::class)
class GenreListDeserializer: IGDBObjectListDeserializer<Genre>(GenreDeserializer())