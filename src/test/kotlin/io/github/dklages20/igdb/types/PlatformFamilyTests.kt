package io.github.dklages20.igdb.types

import io.github.dklages20.igdb.runBaseObjectTest
import io.github.dklages20.igdb.runIdOnlyObjectTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class PlatformFamilyTests {

    @Test
    fun testIdOnly() {
        val idOnlyData = runIdOnlyObjectTest(PlatformFamily::class)
        assertEquals(idOnlyData.id, 5)
    }

    @Test
    fun testBaseData() {
        val baseData = runBaseObjectTest(PlatformFamily::class)
        assertEquals(baseData.id, 5)
        assertEquals(baseData.name, "Nintendo")
        assertEquals(baseData.slug, "nintendo")
        assertEquals(baseData.checksum, "398e5c87-f7db-6265-6da6-433441385208")
    }
}