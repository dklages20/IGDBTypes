package io.github.dklages20.igdb.types

import io.github.dklages20.igdb.runBaseObjectTest
import io.github.dklages20.igdb.runIdOnlyObjectTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ReleaseDateRegionTests {

    @Test
    fun testIdOnly() {
        val idOnlyData = runIdOnlyObjectTest(ReleaseDateRegion::class)
        assertEquals(idOnlyData.id, 1)
    }

    @Test
    fun testBaseData() {
        val baseData = runBaseObjectTest(ReleaseDateRegion::class)
        assertEquals(baseData.id, 1)
        assertEquals(baseData.region, "europe")
        assertEquals(baseData.createdAt, 1738108800)
        assertEquals(baseData.updatedAt, 1738108800)
        assertEquals(baseData.checksum, "123e4567-e89b-12d3-a456-426614175000")
    }
}