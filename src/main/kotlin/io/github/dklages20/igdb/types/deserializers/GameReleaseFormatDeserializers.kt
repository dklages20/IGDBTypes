package io.github.dklages20.igdb.types.deserializers

import io.github.dklages20.igdb.types.GameReleaseFormat

class GameReleaseFormatDeserializer: IGDBObjectDeserializer<GameReleaseFormat>(GameReleaseFormat::class)
class GameReleaseFormatListDeserializer: IGDBObjectListDeserializer<GameReleaseFormat>(GameReleaseFormatDeserializer())