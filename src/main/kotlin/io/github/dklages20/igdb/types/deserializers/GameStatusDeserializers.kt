package io.github.dklages20.igdb.types.deserializers

import io.github.dklages20.igdb.types.GameStatus

class GameStatusDeserializer: IGDBObjectDeserializer<GameStatus>(GameStatus::class)
class GameStatusListDeserializer: IGDBObjectListDeserializer<GameStatus>(GameStatusDeserializer())