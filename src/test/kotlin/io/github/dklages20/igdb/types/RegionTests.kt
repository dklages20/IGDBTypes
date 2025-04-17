package io.github.dklages20.igdb.types

import io.github.dklages20.igdb.runBaseObjectTest
import io.github.dklages20.igdb.runIdOnlyObjectTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RegionTests {

    @Test
    fun testIdOnly() {
        val idOnlyData = runIdOnlyObjectTest(Region::class)
        assertEquals(idOnlyData.id, 3)
    }

    @Test
    fun testBaseData() {
        val baseData = runBaseObjectTest(Region::class)
        assertEquals(baseData.id, 3)
        assertEquals(baseData.name, "Japan")
        assertEquals(baseData.category, "locale")
        assertEquals(baseData.identifier, "ja-JP")
        assertEquals(baseData.createdAt, 1654688003)
        assertEquals(baseData.updatedAt, 1654688003)
        assertEquals(baseData.checksum, "30a70790-d254-52df-e438-99ee4529669d")
    }
}
