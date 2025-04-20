package io.github.dklages20.igdb.types.deserializers

import io.github.dklages20.igdb.types.AlternativeName

class AlternativeNameDeserializer: IGDBObjectDeserializer<AlternativeName>(AlternativeName::class)
class AlternativeNameListDeserializer: IGDBObjectListDeserializer<AlternativeName>(AlternativeNameDeserializer())