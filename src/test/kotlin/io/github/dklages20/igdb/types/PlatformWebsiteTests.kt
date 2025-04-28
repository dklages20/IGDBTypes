package io.github.dklages20.igdb.types

import io.github.dklages20.igdb.runBaseObjectTest
import io.github.dklages20.igdb.runIdOnlyObjectTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class PlatformWebsiteTests {

    @Test
    fun testIdOnly() {
        val idOnlyData = runIdOnlyObjectTest(PlatformWebsite::class)
        assertEquals(idOnlyData.id, 172)
    }

    @Test
    fun testBaseData() {
        val baseData = runBaseObjectTest(PlatformWebsite::class)
        assertEquals(baseData.id, 172)
        assertEquals(baseData.category, PlatformWebsite.Category.OFFICIAL)
        assertEquals(baseData.trusted, false)
        assertEquals(baseData.url, "https://web.archive.org/web/20020802082913/http://www.nuon-tech.com/")
        assertEquals(baseData.checksum, "c2af5c42-dde5-6638-0e00-0408121af316")
    }
}