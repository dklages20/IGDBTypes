package io.github.dklages20.igdb.types

import io.github.dklages20.igdb.runBaseObjectTest
import io.github.dklages20.igdb.runIdOnlyObjectTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class KeywordTests {

    @Test
    fun testIdOnly() {
        val idOnlyData = runIdOnlyObjectTest(Keyword::class)
        assertEquals(idOnlyData.id, 38675)
    }

    @Test
    fun testBaseData() {
        val baseData = runBaseObjectTest(Keyword::class)
        assertEquals(baseData.id, 38675)
        assertEquals(baseData.createdAt, 1687918255)
        assertEquals(baseData.name, "wario land ii")
        assertEquals(baseData.slug, "wario-land-ii")
        assertEquals(baseData.updatedAt, 1687918255)
        assertEquals(baseData.url, "https://www.igdb.com/categories/wario-land-ii")
        assertEquals(baseData.checksum, "e0b4142b-338f-1992-d992-b1938e0b6f2d")
    }
}