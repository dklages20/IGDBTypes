package io.github.dklages20.igdb.types.deserializers

import io.github.dklages20.igdb.types.AgeRatingContentDescription

class AgeRatingContentDescriptionDeserializer: IGDBObjectDeserializer<AgeRatingContentDescription>(AgeRatingContentDescription::class)
class AgeRatingContentDescriptionListDeserializer: IGDBObjectListDeserializer<AgeRatingContentDescription>(AgeRatingContentDescriptionDeserializer())

