package io.github.dklages20.igdb.types

import io.github.dklages20.igdb.runBaseObjectTest
import io.github.dklages20.igdb.runExpandedObjectTest
import io.github.dklages20.igdb.runIdOnlyObjectTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FranchiseTests {

    @Test
    fun testIdOnly() {
        val idOnlyData = runIdOnlyObjectTest(Franchise::class)
        assertEquals(idOnlyData.id, 4289)
    }

    @Test
    fun testBaseData() {
        val baseData = runBaseObjectTest(Franchise::class)
        assertEquals(baseData.id, 4289)
        assertEquals(baseData.createdAt, 1673279586)
        assertEquals(baseData.games?.map { it.id }, listOf(62563))
        assertEquals(baseData.name, "Space Dandy")
        assertEquals(baseData.slug, "space-dandy")
        assertEquals(baseData.updatedAt, 1673279586)
        assertEquals(baseData.url, "https://www.igdb.com/franchises/space-dandy")
        assertEquals(baseData.checksum, "e0727076-87ba-9ac7-1687-fa308c5d965a")
    }

    @Test
    fun testExpanded() {
        runExpandedObjectTest(Franchise::class)
    }
}