package io.github.dklages20.igdb.types.deserializers

import io.github.dklages20.igdb.types.Game

class GameDeserializer : IGDBObjectDeserializer<Game>(Game::class)
class GameListDeserializer: IGDBObjectListDeserializer<Game>(GameDeserializer())