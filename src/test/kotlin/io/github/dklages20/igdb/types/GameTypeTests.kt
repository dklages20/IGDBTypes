package io.github.dklages20.igdb.types

import io.github.dklages20.igdb.runBaseObjectTest
import io.github.dklages20.igdb.runIdOnlyObjectTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class GameTypeTests {

    @Test
    fun testIdOnly() {
        val idOnlyData = runIdOnlyObjectTest(GameType::class)
        assertEquals(idOnlyData.id, 3)
    }

    @Test
    fun testBaseData() {
        val baseData = runBaseObjectTest(GameType::class)
        assertEquals(baseData.id, 3)
        assertEquals(baseData.type, "Bundle")
        assertEquals(baseData.createdAt, 1743587713)
        assertEquals(baseData.updatedAt, 1743587713)
        assertEquals(baseData.checksum, "7e161bed-8efc-f4fe-6dc9-7732eb2bf856")
    }
}