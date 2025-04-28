package io.github.dklages20.igdb.types.deserializers

import io.github.dklages20.igdb.types.GameEngineLogo

class GameEngineLogoDeserializer: IGDBObjectDeserializer<GameEngineLogo>(GameEngineLogo::class)
class GameEngineLogoListDeserializer: IGDBObjectListDeserializer<GameEngineLogo>(GameEngineLogoDeserializer())