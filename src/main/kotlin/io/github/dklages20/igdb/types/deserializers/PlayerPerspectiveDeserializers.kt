package io.github.dklages20.igdb.types.deserializers

import io.github.dklages20.igdb.types.PlayerPerspective

class PlayerPerspectiveDeserializer: IGDBObjectDeserializer<PlayerPerspective>(PlayerPerspective::class)
class PlayerPerspectiveListDeserializer: IGDBObjectListDeserializer<PlayerPerspective>(PlayerPerspectiveDeserializer())