package io.github.dklages20.igdb.types.deserializers

import io.github.dklages20.igdb.types.GameMode

class GameModeDeserializer: IGDBObjectDeserializer<GameMode>(GameMode::class)
class GameModeListDeserializer: IGDBObjectListDeserializer<GameMode>(GameModeDeserializer())