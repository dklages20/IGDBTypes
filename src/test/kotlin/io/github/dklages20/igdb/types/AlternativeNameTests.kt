package io.github.dklages20.igdb.types

import io.github.dklages20.igdb.runBaseObjectTest
import io.github.dklages20.igdb.runExpandedObjectTest
import io.github.dklages20.igdb.runIdOnlyObjectTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class AlternativeNameTests {

    @Test
    fun testIdOnly() {
        val idOnlyData = runIdOnlyObjectTest(AlternativeName::class)
        assertEquals(idOnlyData.id, 75586)
    }

    @Test
    fun testBase() {
        val baseData = runBaseObjectTest(AlternativeName::class)
        assertEquals(baseData.id, 75586)
        assertEquals(baseData.name, "CROSSQUARE")
        assertEquals(baseData.comment, "Stylized title")
        assertEquals(baseData.checksum, "d3493ad4-302e-c5b8-30cc-bbaad30c69d6")
        assertEquals(baseData.game?.id, 175241)
    }

    @Test
    fun testExpanded() {
        runExpandedObjectTest(AlternativeName::class)
    }
}
