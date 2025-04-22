package io.github.dklages20.igdb.types

import io.github.dklages20.igdb.runBaseObjectTest
import io.github.dklages20.igdb.runExpandedObjectTest
import io.github.dklages20.igdb.runIdOnlyObjectTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class InvolvedCompanyTests {

    @Test
    fun testIdOnly() {
        val idOnlyData = runIdOnlyObjectTest(InvolvedCompany::class)
        assertEquals(idOnlyData.id, 95000)
    }

    @Test
    fun testBaseData() {
        val baseData = runBaseObjectTest(InvolvedCompany::class)
        assertEquals(baseData.id, 95000)
        assertEquals(baseData.company?.id, 14486)
        assertEquals(baseData.createdAt, 1585267200)
        assertEquals(baseData.developer, true)
        assertEquals(baseData.game?.id, 131992)
        assertEquals(baseData.porting, false)
        assertEquals(baseData.publisher, false)
        assertEquals(baseData.supporting, false)
        assertEquals(baseData.updatedAt, 1585440000)
        assertEquals(baseData.checksum, "43e91be1-592f-c3be-3e1d-447b3f17584c")
    }

    @Test
    fun testExpanded() {
        runExpandedObjectTest(InvolvedCompany::class)
    }
}