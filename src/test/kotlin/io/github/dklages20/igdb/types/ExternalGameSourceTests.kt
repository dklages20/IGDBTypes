package io.github.dklages20.igdb.types

import io.github.dklages20.igdb.runBaseObjectTest
import io.github.dklages20.igdb.runIdOnlyObjectTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ExternalGameSourceTests {

    @Test
    fun testIdOnly() {
        val idOnlyData = runIdOnlyObjectTest(ExternalGameSource::class)
        assertEquals(idOnlyData.id, 1)
    }

    @Test
    fun testBaseData() {
        val baseData = runBaseObjectTest(ExternalGameSource::class)
        assertEquals(baseData.id, 1)
        assertEquals(baseData.name, "Steam")
        assertEquals(baseData.createdAt, 1612529709)
        assertEquals(baseData.updatedAt, 1695207341)
        assertEquals(baseData.checksum, "123e4567-e89b-12d3-a456-426614174000")
    }
}