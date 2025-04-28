package io.github.dklages20.igdb.types.deserializers

import io.github.dklages20.igdb.types.ExternalGameSource

class ExternalGameSourceDeserializer: IGDBObjectDeserializer<ExternalGameSource>(ExternalGameSource::class)
class ExternalGameSourceListDeserializer: IGDBObjectListDeserializer<ExternalGameSource>(ExternalGameSourceDeserializer())