# IGDB Types

This library provides data types for the IGDB API, which is a video game database.

## What types are defined?

The following types are currently supported:

- [AgeRating](https://api-docs.igdb.com/#age-rating)
- [AgeRatingContentDescription](https://api-docs.igdb.com/#age-rating-content-description)
- [AgeRatingContentDescriptionV2](https://api-docs.igdb.com/#age-rating-content-description-v2)
- [Organization](https://api-docs.igdb.com/#organization)

## How do I use this library?

To use this library, you need to add the following dependency to your `build.gradle` file:

```kotlin
dependencies {
    implementation("io.github.dklages20:igdb-types:<version>")
}
```

Then, you can read values into the types using a Jackson `ObjectMapper`:

```kotlin
import com.fasterxml.jackson.databind.ObjectMapper
import io.github.dklages20.igdb.types.AgeRating

val objectMapper = ObjectMapper()
val ageRating = objectMapper.readValue(jsonString, AgeRating::class.java)
```
