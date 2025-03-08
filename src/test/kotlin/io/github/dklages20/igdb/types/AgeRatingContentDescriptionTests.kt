package io.github.dklages20.igdb.types

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import org.junit.jupiter.api.assertDoesNotThrow
import org.junit.jupiter.api.fail
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource


class AgeRatingContentDescriptionTests {

    private val objectMapper = jacksonObjectMapper()

    companion object {
        const val RESOURCE_PATH = "/igdb/age-rating-content-descriptions"
    }

    @ParameterizedTest
    @ValueSource(strings = ["full.json", "partial.json"])
    fun testDeserialization(file: String) {
        val jsonContent = object {}.javaClass.getResourceAsStream("${RESOURCE_PATH}/$file")
            ?.bufferedReader()
            ?.use { it.readText() }
            ?: fail("Failed to read JSON from $file")

        assertDoesNotThrow {
            objectMapper.readValue<AgeRatingContentDescription>(jsonContent)
        }
    }
}
