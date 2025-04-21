package io.github.dklages20.igdb.types.deserializers;

import io.github.dklages20.igdb.types.ExternalGame;

class ExternalGameDeserializer: IGDBObjectDeserializer<ExternalGame>(ExternalGame::class)
class ExternalGameListDeserializer: IGDBObjectListDeserializer<ExternalGame>(ExternalGameDeserializer())