package io.github.dklages20.igdb.types

import io.github.dklages20.igdb.runBaseObjectTest
import io.github.dklages20.igdb.runIdOnlyObjectTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class AgeRatingOrganizationTests {

    @Test
    fun testIdOnly() {
        val idOnlyData = runIdOnlyObjectTest(AgeRatingOrganization::class)
        assertEquals(1, idOnlyData.id)
    }

    @Test
    fun testBase() {
        val baseData = runBaseObjectTest(AgeRatingOrganization::class)
        assertEquals(1, baseData.id)
        assertEquals("ESRB", baseData.name)
        assertEquals("550e8400-e29b-41d4-a716-446655440000", baseData.checksum)
        assertEquals(1737936000, baseData.createdAt)
        assertEquals(1737936000, baseData.updatedAt)
    }
}
