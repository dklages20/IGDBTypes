package io.github.dklages20.igdb.types.deserializers

import io.github.dklages20.igdb.types.Character

class CharacterDeserializer: IGDBObjectDeserializer<Character>(Character::class)
class CharacterListDeserializer: IGDBObjectListDeserializer<Character>(CharacterDeserializer())
