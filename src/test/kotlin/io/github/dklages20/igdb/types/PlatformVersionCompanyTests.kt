package io.github.dklages20.igdb.types

import io.github.dklages20.igdb.runBaseObjectTest
import io.github.dklages20.igdb.runExpandedObjectTest
import io.github.dklages20.igdb.runIdOnlyObjectTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class PlatformVersionCompanyTests {

    @Test
    fun testIdOnly() {
        val idOnlyData = runIdOnlyObjectTest(PlatformVersionCompany::class)
        assertEquals(idOnlyData.id, 286)
    }

    @Test
    fun testBaseData() {
        val baseData = runBaseObjectTest(PlatformVersionCompany::class)
        assertEquals(baseData.id, 286)
        assertEquals(baseData.company?.id, 11986)
        assertEquals(baseData.developer, true)
        assertEquals(baseData.manufacturer, true)
        assertEquals(baseData.checksum, "e5035f31-713a-1036-2968-dd353b74db3b")
    }

    @Test
    fun testExpanded() {
        runExpandedObjectTest(PlatformVersionCompany::class)
    }
}