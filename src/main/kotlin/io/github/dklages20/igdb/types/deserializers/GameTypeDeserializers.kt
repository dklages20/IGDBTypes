package io.github.dklages20.igdb.types.deserializers

import io.github.dklages20.igdb.types.GameType

class GameTypeDeserializer: IGDBObjectDeserializer<GameType>(GameType::class)
class GameTypeListDeserializer: IGDBObjectListDeserializer<GameType>(GameTypeDeserializer())