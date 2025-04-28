package io.github.dklages20.igdb.types.deserializers

import io.github.dklages20.igdb.types.GameVideo

class GameVideoDeserializer : IGDBObjectDeserializer<GameVideo>(GameVideo::class)
class GameVideoListDeserializer : IGDBObjectListDeserializer<GameVideo>(GameVideoDeserializer())