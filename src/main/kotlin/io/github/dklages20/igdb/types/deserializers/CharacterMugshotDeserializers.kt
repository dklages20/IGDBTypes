package io.github.dklages20.igdb.types.deserializers

import io.github.dklages20.igdb.types.CharacterMugshot

class CharacterMugshotDeserializer: IGDBObjectDeserializer<CharacterMugshot>(CharacterMugshot::class)
class CharacterMugshotListDeserializer: IGDBObjectListDeserializer<CharacterMugshot>(CharacterMugshotDeserializer())