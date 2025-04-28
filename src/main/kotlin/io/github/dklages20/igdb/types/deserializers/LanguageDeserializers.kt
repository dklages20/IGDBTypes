package io.github.dklages20.igdb.types.deserializers

import io.github.dklages20.igdb.types.Language

class LanguageDeserializer: IGDBObjectDeserializer<Language>(Language::class)
class languageListDeserializer: IGDBObjectListDeserializer<Language>(LanguageDeserializer())
