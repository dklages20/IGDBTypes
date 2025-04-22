package io.github.dklages20.igdb.types.deserializers

import io.github.dklages20.igdb.types.LanguageSupport

class LanguageSupportDeserializer: IGDBObjectDeserializer<LanguageSupport>(LanguageSupport::class)
class LanguageSupportListDeserializer: IGDBObjectListDeserializer<LanguageSupport>(LanguageSupportDeserializer())