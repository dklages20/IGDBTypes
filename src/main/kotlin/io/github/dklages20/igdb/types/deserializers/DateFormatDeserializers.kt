package io.github.dklages20.igdb.types.deserializers

import io.github.dklages20.igdb.types.DateFormat

class DateFormatDeserializer: IGDBObjectDeserializer<DateFormat>(DateFormat::class)
class DateFormatListDeserializer: IGDBObjectListDeserializer<DateFormat>(DateFormatDeserializer())