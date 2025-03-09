package io.github.dklages20.igdb.types

import io.github.dklages20.igdb.runBaseObjectTest
import io.github.dklages20.igdb.runIdOnlyObjectTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class AgeRatingTests {

    @Test
    fun testIdOnly() {
        val idOnlyData = runIdOnlyObjectTest(AgeRatingContentDescription::class)
        assertEquals(idOnlyData.id, 47)
    }

    @Test
    fun testBase() {
        val baseData = runBaseObjectTest(AgeRatingContentDescription::class)
        assertEquals(47, baseData.id)
        assertEquals(21, baseData.category)
        assertEquals("Strong Language", baseData.description)
        assertEquals("befd2777-5035-29b9-a592-3e0ba572b3bb", baseData.checksum)
    }

}
