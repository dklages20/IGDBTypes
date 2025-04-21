package io.github.dklages20.igdb.types.deserializers

import io.github.dklages20.igdb.types.GameEngine

class GameEngineDeserializer: IGDBObjectDeserializer<GameEngine>(GameEngine::class)
class GameEngineListDeserializer: IGDBObjectListDeserializer<GameEngine>(GameEngineDeserializer())