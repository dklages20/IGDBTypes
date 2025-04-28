package io.github.dklages20.igdb.types

import io.github.dklages20.igdb.runBaseObjectTest
import io.github.dklages20.igdb.runIdOnlyObjectTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class GenreTests {

    @Test
    fun testIdOnly() {
        val idOnlyData = runIdOnlyObjectTest(Genre::class)
        assertEquals(idOnlyData.id, 2)
    }

    @Test
    fun testBaseData() {
        val baseData = runBaseObjectTest(Genre::class)
        assertEquals(baseData.id, 2)
        assertEquals(baseData.name, "Point-and-click")
        assertEquals(baseData.slug, "point-and-click")
        assertEquals(baseData.url, "https://www.igdb.com/genres/point-and-click")
        assertEquals(baseData.createdAt, 1297639288)
        assertEquals(baseData.updatedAt, 1323382086)
        assertEquals(baseData.checksum, "b295f28a-5f68-fc3e-5de2-f3195e10d160")
    }
}