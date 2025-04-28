package io.github.dklages20.igdb.types.deserializers

import io.github.dklages20.igdb.types.Theme

class ThemeDeserializer : IGDBObjectDeserializer<Theme>(Theme::class)
class ThemeListDeserializer: IGDBObjectListDeserializer<Theme>(ThemeDeserializer())