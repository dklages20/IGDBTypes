# IGDB Types

This library provides data types for the IGDB API, which is a video game database.

## What types are defined?

The following types are currently supported:

- [AgeRating](https://api-docs.igdb.com/#age-rating)
- [AgeRatingCategory](https://api-docs.igdb.com/#age-rating-category)
- [AgeRatingContentDescription](https://api-docs.igdb.com/#age-rating-content-description)
- [AgeRatingContentDescriptionV2](https://api-docs.igdb.com/#age-rating-content-description-v2)
- [AgeRatingOrganization](https://api-docs.igdb.com/#age-rating-organization)
- [AlternativeName](https://api-docs.igdb.com/#alternative-name)
- [Artwork](https://api-docs.igdb.com/#artwork)
- [Character](https://api-docs.igdb.com/#character)
- [CharacterGender](https://api-docs.igdb.com/#character-gender)
- [CharacterMugShot](https://api-docs.igdb.com/#character-mug-shot)
- [CharacterSpecie](https://api-docs.igdb.com/#character-specie)

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

## How do I add a new type?

Typically, when adding a new type, you'll need to add the following classes:

- The type itself, e.g. `AgeRating`
- A deserializer that can be used to deserialize a single instance of the type, e.g. `AgeRatingDeserializer`
- A deserializer that can be used to deserialize a list of instances of the type, e.g. `AgeRatingListDeserializer`

If the type is simple enough, you might not need to add the deserializers. However, if the type is complex, please make sure you add a deserializer for both a single and list of objects.

## Publishing

### Manually Publishing

In order to manually publish this repository to GitHub Packages, you have two options.

#### Environment Variables

You should set the following environment variables:

- `GITHUB_USERNAME`: Your GitHub username.
- `GITHUB_TOKEN`: Your GitHub personal access token with the `write:packages` scope.

Then, you can run the following command:

```bash
./gradlew publish
```

#### Gradle Properties

Alternatively, you can pass the `githubUsername` and `githubPassword` properties to Gradle using the `-P` flag:

```bash
./gradlew publish -PgithubUsername=<your_github_username> -PgithubToken=<your_github_token>
```
