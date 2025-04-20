package io.github.dklages20.igdb.types.deserializers

import io.github.dklages20.igdb.types.AgeRatingCategory

class AgeRatingCategoryDeserializer: IGDBObjectDeserializer<AgeRatingCategory>(AgeRatingCategory::class)
class AgeRatingCategoryListDeserializer: IGDBObjectListDeserializer<AgeRatingCategory>(AgeRatingCategoryDeserializer())