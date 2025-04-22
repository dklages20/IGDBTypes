package io.github.dklages20.igdb.types

import io.github.dklages20.igdb.runBaseObjectTest
import io.github.dklages20.igdb.runIdOnlyObjectTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LanguageSupportTypeTests {

    @Test
    fun testIdOnly() {
        val idOnlyData = runIdOnlyObjectTest(LanguageSupportType::class)
        assertEquals(idOnlyData.id, 1)
    }

    @Test
    fun testBaseData() {
        val baseData = runBaseObjectTest(LanguageSupportType::class)
        assertEquals(baseData.id, 1)
        assertEquals(baseData.name, "Audio")
        assertEquals(baseData.createdAt, 1664803639)
        assertEquals(baseData.updatedAt, 1664803639)
        assertEquals(baseData.checksum, "17300b0f-8e60-5cf7-2b2d-6797e4ccb813")
    }
}