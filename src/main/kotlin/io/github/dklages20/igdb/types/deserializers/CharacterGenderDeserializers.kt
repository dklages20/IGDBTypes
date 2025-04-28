package io.github.dklages20.igdb.types.deserializers

import io.github.dklages20.igdb.types.CharacterGender

class CharacterGenderDeserializer: IGDBObjectDeserializer<CharacterGender>(CharacterGender::class)
class CharacterGenderListDeserializer: IGDBObjectListDeserializer<CharacterGender>(CharacterGenderDeserializer())