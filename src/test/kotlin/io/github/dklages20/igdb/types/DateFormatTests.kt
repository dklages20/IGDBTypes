package io.github.dklages20.igdb.types

import io.github.dklages20.igdb.runBaseObjectTest
import io.github.dklages20.igdb.runIdOnlyObjectTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DateFormatTests {

    @Test
    fun testIdOnly() {
        val idOnlyData = runIdOnlyObjectTest(DateFormat::class)
        assertEquals(idOnlyData.id, 0)
    }

    @Test
    fun testBaseData() {
        val baseData = runBaseObjectTest(DateFormat::class)
        assertEquals(baseData.id, 0)
        assertEquals(baseData.format, "YYYYMMDD")
        assertEquals(baseData.createdAt, 1738022400)
        assertEquals(baseData.updatedAt, 1738022400)
        assertEquals(baseData.checksum, "550e8400-e29b-41d4-a716-446655440000")
    }
}