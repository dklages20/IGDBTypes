package io.github.dklages20.igdb.types

import io.github.dklages20.igdb.runBaseObjectTest
import io.github.dklages20.igdb.runExpandedObjectTest
import io.github.dklages20.igdb.runIdOnlyObjectTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CompanyTests {

    @Test
    fun testIdOnly() {
        val idOnlyData = runIdOnlyObjectTest(Company::class)
        assertEquals(idOnlyData.id, 61668)
    }

    @Test
    fun testBaseData() {
        val baseData = runBaseObjectTest(Company::class)
        assertEquals(baseData.id, 61668)
        assertEquals(baseData.changeDateCategory, Company.ChangeDateCategory.TBD)
        assertEquals(baseData.country, 840)
        assertEquals(baseData.createdAt, 1739687269)
        assertEquals(baseData.description, "CyrustheVirus Studios was established by Sheldon Slater, also known as CyrustheVirus001, in 2019. Serving as the sole developer, programmer, animator, artist, and composer for the project Cold Lazarus.")
        assertEquals(baseData.developed?.map { it.id }, listOf(289276))
        assertEquals(baseData.name, "CyrusTheVirus Studios")
        assertEquals(baseData.slug, "cyrusthevirus-studios")
        assertEquals(baseData.startDate, 1548979200)
        assertEquals(baseData.startDateCategory, Company.StartDateCategory.YYYYMMMMDD)
        assertEquals(baseData.updatedAt, 1739987957)
        assertEquals(baseData.url, "https://www.igdb.com/companies/cyrusthevirus-studios")
        assertEquals(baseData.websites?.map { it.id }, listOf(13818))
        assertEquals(baseData.checksum, "95dac7b6-f88b-6715-f88a-beac4da5d751")
        assertEquals(baseData.status?.id, 0)
        assertEquals(baseData.startDateFormat?.id, 0)
    }

    @Test
    fun testExpanded() {
        runExpandedObjectTest(Company::class)
    }
}