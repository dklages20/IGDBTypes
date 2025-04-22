package io.github.dklages20.igdb.types

import io.github.dklages20.igdb.runBaseObjectTest
import io.github.dklages20.igdb.runIdOnlyObjectTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class GameStatusTests {

    @Test
    fun testIdOnly() {
        val idOnlyData = runIdOnlyObjectTest(GameStatus::class)
        assertEquals(idOnlyData.id, 0)
    }

    @Test
    fun testBaseData() {
        val baseData = runBaseObjectTest(GameStatus::class)
        assertEquals(baseData.id, 0)
        assertEquals(baseData.status, "Released")
        assertEquals(baseData.createdAt, 1738540800)
        assertEquals(baseData.updatedAt, 1738540800)
        assertEquals(baseData.checksum, "123e4567-e89b-12d3-a456-426614176000")
    }
}