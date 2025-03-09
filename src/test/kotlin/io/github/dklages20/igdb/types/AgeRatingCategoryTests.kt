package io.github.dklages20.igdb.types

import io.github.dklages20.igdb.runBaseObjectTest
import io.github.dklages20.igdb.runExpandedObjectTest
import io.github.dklages20.igdb.runIdOnlyObjectTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class AgeRatingCategoryTests {

    @Test
    fun testIdOnly() {
        val idOnlyData = runIdOnlyObjectTest(AgeRatingCategory::class)
        assertEquals(idOnlyData.id, 1)
    }

    @Test
    fun testBase() {
        val baseData = runBaseObjectTest(AgeRatingCategory::class)
        assertEquals(1, baseData.id)
        assertEquals("Three", baseData.rating)
        assertEquals(1, baseData.organization?.id)
        assertEquals(1737936000, baseData.createdAt)
        assertEquals(1737936000, baseData.updatedAt)
        assertEquals("550e8400-e29b-41d4-a716-446655440001", baseData.checksum)
    }

    @Test
    fun testExpanded() {
        runExpandedObjectTest(AgeRatingCategory::class)
    }
}
