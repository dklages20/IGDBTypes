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
- [Collection](https://api-docs.igdb.com/#collection)
- [CollectionMembership](https://api-docs.igdb.com/#collection-membership)
- [CollectionMembershipType](https://api-docs.igdb.com/#collection-membership)
- [CollectionRelation](https://api-docs.igdb.com/#collection-relation)
- [CollectionRelationType](https://api-docs.igdb.com/#collection-relation-type)
- [CollectionType](https://api-docs.igdb.com/#collection-type)
- [Company](https://api-docs.igdb.com/#company)
- [CompanyLogo](https://api-docs.igdb.com/#company-logo)
- [CompanyStatus](https://api-docs.igdb.com/#company-status)
- [CompanyWebsite](https://api-docs.igdb.com/#company-website)
- [Cover](https://api-docs.igdb.com/#cover)
- [DateFormat](https://api-docs.igdb.com/#date-format)
- [EventLogo](https://api-docs.igdb.com/#event-logo)
- [EventNetwork](https://api-docs.igdb.com/#event-network)
- [Event](https://api-docs.igdb.com/#event)
- [ExternalGame](https://api-docs.igdb.com/#external-game)
- [ExternalGameSource](https://api-docs.igdb.com/#external-game-source)
- [Franchise](https://api-docs.igdb.com/#franchise)
- [Game](https://api-docs.igdb.com/#game)
- [GameEngine](https://api-docs.igdb.com/#game-engine)
- [GameEngineLogo](https://api-docs.igdb.com/#game-engine-logo)
- [GameLocalization](https://api-docs.igdb.com/#game-localization)
- [GameMode](https://api-docs.igdb.com/#game-mode)
- [GameReleaseFormat](https://api-docs.igdb.com/#game-release-format)
- [GameStatus](https://api-docs.igdb.com/#game-status)
- [GameTimeToBeat](https://api-docs.igdb.com/#game-time-to-beat)
- [GameType](https://api-docs.igdb.com/#game-type)
- [GameVersion](https://api-docs.igdb.com/#game-version)
- [GameVersionFeature](https://api-docs.igdb.com/#game-version-feature)
- [GameVersionFeatureValue](https://api-docs.igdb.com/#game-version-feature-value)
- [GameVideo](https://api-docs.igdb.com/#game-video)
- [Genre](https://api-docs.igdb.com/#genre)
- [InvolvedCompany](https://api-docs.igdb.com/#involved-company)
- [Keyword](https://api-docs.igdb.com/#keyword)
- [Language](https://api-docs.igdb.com/#language)
- [LanguageSupport](https://api-docs.igdb.com/#language-support)
- [LanguageSupportType](https://api-docs.igdb.com/#language-support-type)
- [MultiplayerMode](https://api-docs.igdb.com/#multiplayer-mode)
- [NetworkType](https://api-docs.igdb.com/#network-type)
- [Platform](https://api-docs.igdb.com/#platform)
- [PlatformFamily](https://api-docs.igdb.com/#platform-family)
- [PlatformLogo](https://api-docs.igdb.com/#platform-logo)
- [PlatformType](https://api-docs.igdb.com/#platform-type)
- [PlatformVersion](https://api-docs.igdb.com/#platform-version)
- [PlatformVersionCompany](https://api-docs.igdb.com/#platform-version-company)
- [PlatformVersionReleaseDate](https://api-docs.igdb.com/#platform-version-release-date)
- [PlatformWebsite](https://api-docs.igdb.com/#platform-website)
- [PlayerPerspective](https://api-docs.igdb.com/#player-perspective)
- [PopularityPrimitive](https://api-docs.igdb.com/#popularity-primitive)
- [PopularityType](https://api-docs.igdb.com/#popularity-type)
- [Region](https://api-docs.igdb.com/#region)
- [ReleaseDate](https://api-docs.igdb.com/#release-date)
- [ReleaseDateRegion](https://api-docs.igdb.com/#release-date-region)
- [ReleaseDateStatus](https://api-docs.igdb.com/#release-date-status)
- [Screenshot](https://api-docs.igdb.com/#screenshot)
- [Search](https://api-docs.igdb.com/#search)
- [Theme](https://api-docs.igdb.com/#theme)
- [Website](https://api-docs.igdb.com/#website)
- [WebsiteType](https://api-docs.igdb.com/#website-type)

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
