package io.github.dklages20.igdb.types.deserializers

import io.github.dklages20.igdb.types.AgeRating

class AgeRatingDeserializer: IGDBObjectDeserializer<AgeRating>(AgeRating::class)
class AgeRatingListDeserializer: IGDBObjectListDeserializer<AgeRating>(AgeRatingDeserializer())