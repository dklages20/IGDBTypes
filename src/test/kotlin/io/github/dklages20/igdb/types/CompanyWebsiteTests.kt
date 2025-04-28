package io.github.dklages20.igdb.types

import io.github.dklages20.igdb.runBaseObjectTest
import io.github.dklages20.igdb.runExpandedObjectTest
import io.github.dklages20.igdb.runIdOnlyObjectTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CompanyWebsiteTests {

    @Test
    fun testIdOnly() {
        val idOnlyData = runIdOnlyObjectTest(CompanyWebsite::class)
        assertEquals(idOnlyData.id, 13302)
    }

    @Test
    fun testBaseData() {
        val baseData = runBaseObjectTest(CompanyWebsite::class)
        assertEquals(baseData.id, 13302)
        assertEquals(baseData.category, CompanyWebsite.Category.OFFICIAL)
        assertEquals(baseData.url, "https://warcryinteractive.com")
        assertEquals(baseData.checksum, "0edc7836-5613-5126-31e6-0466da91a881")
        assertEquals(baseData.type?.id, 1)
    }

    @Test
    fun testExpanded() {
        runExpandedObjectTest(CompanyWebsite::class)
    }
}