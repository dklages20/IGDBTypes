package io.github.dklages20.igdb

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import io.github.dklages20.igdb.types.*
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
