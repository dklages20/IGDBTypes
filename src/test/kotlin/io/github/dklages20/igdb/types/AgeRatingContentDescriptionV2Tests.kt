package io.github.dklages20.igdb.types

import io.github.dklages20.igdb.runBaseObjectTest
import io.github.dklages20.igdb.runExpandedObjectTest
import io.github.dklages20.igdb.runIdOnlyObjectTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class AgeRatingContentDescriptionV2Tests {

    @Test
    fun testIdOnly() {
        val idOnlyData = runIdOnlyObjectTest(AgeRatingContentDescriptionV2::class)
        assertEquals(1, idOnlyData.id)
    }

    @Test
    fun testBase() {
        val baseData = runBaseObjectTest(AgeRatingContentDescriptionV2::class)
        assertEquals(1, baseData.id)
        assertEquals("Alcohol Reference", baseData.description)
        assertEquals("550e8400-e29b-41d4-a716-446655440001", baseData.checksum)
        assertEquals(1737936000, baseData.createdAt)
        assertEquals(1737936000, baseData.updatedAt)
        assertEquals(1, baseData.organization?.id)
    }

    @Test
    fun testExpanded() {
        runExpandedObjectTest(AgeRatingContentDescriptionV2::class)
    }

}
