package io.github.dklages20.igdb.types.deserializers

import io.github.dklages20.igdb.types.MultiplayerMode

class MultiplayerModeDeserializer: IGDBObjectDeserializer<MultiplayerMode>(MultiplayerMode::class)
class MultiplayerModeListDeserializer: IGDBObjectListDeserializer<MultiplayerMode>(MultiplayerModeDeserializer())