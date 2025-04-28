package io.github.dklages20.igdb.types.deserializers

import io.github.dklages20.igdb.types.CharacterSpecie

class CharacterSpecieDeserializer: IGDBObjectDeserializer<CharacterSpecie>(CharacterSpecie::class)
class CharacterSpecieListDeserializer: IGDBObjectListDeserializer<CharacterSpecie>(CharacterSpecieDeserializer())