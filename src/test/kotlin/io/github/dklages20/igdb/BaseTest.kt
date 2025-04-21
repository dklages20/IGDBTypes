package io.github.dklages20.igdb

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import io.github.dklages20.igdb.types.*
import io.github.dklages20.igdb.types.Collection
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.assertDoesNotThrow
import kotlin.reflect.KClass

const val IGDB_RESOURCE_BASE_PATH = "/igdb/data"
const val IGDB_RESOURCE_ID_ONLY_FILE = "id_only.json"
const val IGDB_RESOURCE_BASE_FILE = "base.json"
const val IGDB_RESOURCE_EXPANDED_FILE = "expanded.json"

val igdbClassToDataLocation: Map<KClass<*>, String> = mapOf(
    AgeRating::class to "$IGDB_RESOURCE_BASE_PATH/age_rating",
    AgeRatingContentDescription::class to "$IGDB_RESOURCE_BASE_PATH/age_rating_content_description",
    AgeRatingContentDescriptionV2::class to "$IGDB_RESOURCE_BASE_PATH/age_rating_content_description_v2",
    AgeRatingOrganization::class to "$IGDB_RESOURCE_BASE_PATH/age_rating_organization",
    AgeRatingCategory::class to "$IGDB_RESOURCE_BASE_PATH/age_rating_category",
    AlternativeName::class to "$IGDB_RESOURCE_BASE_PATH/alternative_name",
    Artwork::class to "$IGDB_RESOURCE_BASE_PATH/artwork",
    Character::class to "$IGDB_RESOURCE_BASE_PATH/characters",
    CharacterGender::class to "$IGDB_RESOURCE_BASE_PATH/character_genders",
    CharacterMugshot::class to "$IGDB_RESOURCE_BASE_PATH/character_mugshots",
    CharacterSpecie::class to "$IGDB_RESOURCE_BASE_PATH/character_species",
    Collection::class to "$IGDB_RESOURCE_BASE_PATH/collections",
    CollectionMembership::class to "$IGDB_RESOURCE_BASE_PATH/collection_memberships",
    CollectionMembershipType::class to "$IGDB_RESOURCE_BASE_PATH/collection_membership_types",
    CollectionRelation::class to "$IGDB_RESOURCE_BASE_PATH/collection_relations",
    CollectionRelationType::class to "$IGDB_RESOURCE_BASE_PATH/collection_relation_types",
    CollectionType::class to "$IGDB_RESOURCE_BASE_PATH/collection_types",
    Company::class to "$IGDB_RESOURCE_BASE_PATH/companies",
    CompanyLogo::class to "$IGDB_RESOURCE_BASE_PATH/company_logos",
    CompanyStatus::class to "$IGDB_RESOURCE_BASE_PATH/company_statuses",
    CompanyWebsite::class to "$IGDB_RESOURCE_BASE_PATH/company_websites",
    Cover::class to "$IGDB_RESOURCE_BASE_PATH/covers",
    DateFormat::class to "$IGDB_RESOURCE_BASE_PATH/date_formats",
    ExternalGame::class to "$IGDB_RESOURCE_BASE_PATH/external_games",
    ExternalGameSource::class to "$IGDB_RESOURCE_BASE_PATH/external_game_sources",
    Franchise::class to "$IGDB_RESOURCE_BASE_PATH/franchises",
    GameLocalization::class to "$IGDB_RESOURCE_BASE_PATH/game_localizations",
    GameReleaseFormat::class to "$IGDB_RESOURCE_BASE_PATH/game_release_formats",
    Platform::class to "$IGDB_RESOURCE_BASE_PATH/platforms",
    PlatformFamily::class to "$IGDB_RESOURCE_BASE_PATH/platform_families",
    PlatformLogo::class to "$IGDB_RESOURCE_BASE_PATH/platform_logos",
    PlatformType::class to "$IGDB_RESOURCE_BASE_PATH/platform_types",
    PlatformVersion::class to "$IGDB_RESOURCE_BASE_PATH/platform_versions",
    PlatformVersionCompany::class to "$IGDB_RESOURCE_BASE_PATH/platform_version_companies",
    PlatformVersionReleaseDate::class to "$IGDB_RESOURCE_BASE_PATH/platform_version_release_dates",
    PlatformWebsite::class to "$IGDB_RESOURCE_BASE_PATH/platform_websites",
    Region::class to "$IGDB_RESOURCE_BASE_PATH/regions",
    ReleaseDateRegion::class to "$IGDB_RESOURCE_BASE_PATH/release_date_regions",
    WebsiteType::class to "$IGDB_RESOURCE_BASE_PATH/website_types",
)

val objectMapper = jacksonObjectMapper()

fun <T : Any> runIdOnlyObjectTest(clazz: KClass<T>): T {
    val dataLocation = igdbClassToDataLocation[clazz] ?: throw IllegalArgumentException("No data location found for class: $clazz")
    val idOnlyFile = "$dataLocation/$IGDB_RESOURCE_ID_ONLY_FILE"
    println("Running ID only test for $clazz using file: $idOnlyFile")

    val idOnlyData = assertDoesNotThrow { objectMapper.readValue(object {}.javaClass.getResourceAsStream(idOnlyFile), clazz.java) }
    assertTrue { idOnlyData != null }

    return idOnlyData
}

fun <T : Any> runBaseObjectTest(clazz: KClass<T>): T {
    val dataLocation = igdbClassToDataLocation[clazz] ?: throw IllegalArgumentException("No data location found for class: $clazz")
    val baseFile = "$dataLocation/$IGDB_RESOURCE_BASE_FILE"
    println("Running base test for $clazz using file: $baseFile")

    val baseData = assertDoesNotThrow { objectMapper.readValue(object {}.javaClass.getResourceAsStream(baseFile), clazz.java) }
    assertTrue { baseData != null }

    return baseData
}

fun <T : Any> runExpandedObjectTest(clazz: KClass<T>): T {
    val dataLocation = igdbClassToDataLocation[clazz] ?: throw IllegalArgumentException("No data location found for class: $clazz")
    val expandedFile = "$dataLocation/$IGDB_RESOURCE_EXPANDED_FILE"
    println("Running expanded test for $clazz using file: $expandedFile")

    val baseData = assertDoesNotThrow { objectMapper.readValue(object {}.javaClass.getResourceAsStream(expandedFile), clazz.java) }
    assertTrue { baseData != null }

    return baseData
}
