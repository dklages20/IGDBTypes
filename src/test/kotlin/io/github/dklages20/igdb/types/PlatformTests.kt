package io.github.dklages20.igdb.types

import io.github.dklages20.igdb.runBaseObjectTest
import io.github.dklages20.igdb.runExpandedObjectTest
import io.github.dklages20.igdb.runIdOnlyObjectTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class PlatformTests {

    @Test
    fun testIdOnly() {
        val idOnlyData = runIdOnlyObjectTest(Platform::class)
        assertEquals(idOnlyData.id, 306)
    }

    @Test
    fun testBaseData() {
        val baseData = runBaseObjectTest(Platform::class)
        assertEquals(baseData.id, 306)
        assertEquals(baseData.category, Platform.Category.CONSOLE)
        assertEquals(baseData.createdAt, 1590781904)
        assertEquals(baseData.generation, 4)
        assertEquals(baseData.name, "Satellaview")
        assertEquals(baseData.platformLogo?.id, 595)
        assertEquals(baseData.platformFamily?.id, 5)
        assertEquals(baseData.slug, "satellaview")
        assertEquals(baseData.updatedAt, 1718027289)
        assertEquals(baseData.url, "https://www.igdb.com/platforms/satellaview")
        assertEquals(baseData.versions?.map { it.id }, listOf(423))
        assertEquals(baseData.websites?.map { it.id }, listOf(205, 289))
        assertEquals(baseData.checksum, "b9e89bb4-6962-0808-a4c0-9060c8ee9ef7")
        assertEquals(baseData.platformType?.id, 1)
    }

    @Test
    fun testExpanded() {
        runExpandedObjectTest(Platform::class)
    }
}