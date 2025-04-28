package io.github.dklages20.igdb.types

import io.github.dklages20.igdb.runBaseObjectTest
import io.github.dklages20.igdb.runExpandedObjectTest
import io.github.dklages20.igdb.runIdOnlyObjectTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class PlatformVersionReleaseDateTests {

    @Test
    fun testIdOnly() {
        val idOnlyData = runIdOnlyObjectTest(PlatformVersionReleaseDate::class)
        assertEquals(idOnlyData.id, 308)
    }

    @Test
    fun testBaseData() {
        val baseData = runBaseObjectTest(PlatformVersionReleaseDate::class)
        assertEquals(baseData.id, 308)
        assertEquals(baseData.category, PlatformVersionReleaseDate.Category.YYYYMMMMDD)
        assertEquals(baseData.createdAt, 1262304000)
        assertEquals(baseData.date, 667958400)
        assertEquals(baseData.human, "Mar 03, 1991")
        assertEquals(baseData.month, 3)
        assertEquals(baseData.region, PlatformVersionReleaseDate.Region.NORTH_AMERICA)
        assertEquals(baseData.updatedAt, 1262304000)
        assertEquals(baseData.year, 1991)
        assertEquals(baseData.checksum, "bde890fd-fdd2-3ff0-02f6-4264a4631a31")
        assertEquals(baseData.dateFormat?.id, 0)
        assertEquals(baseData.releaseRegion?.id, 2)
    }

    @Test
    fun testExpanded() {
        runExpandedObjectTest(PlatformVersionReleaseDate::class)
    }
}