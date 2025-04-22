package io.github.dklages20.igdb.types

import io.github.dklages20.igdb.runBaseObjectTest
import io.github.dklages20.igdb.runIdOnlyObjectTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class GameModeTests {

    @Test
    fun testIdOnly() {
        val idOnlyData = runIdOnlyObjectTest(GameMode::class)
        assertEquals(idOnlyData.id, 1)
    }

    @Test
    fun testBaseData() {
        val baseData = runBaseObjectTest(GameMode::class)
        assertEquals(baseData.id, 1)
        assertEquals(baseData.createdAt, 1298968834)
        assertEquals(baseData.name, "Single player")
        assertEquals(baseData.slug, "single-player")
        assertEquals(baseData.updatedAt, 1323289216)
        assertEquals(baseData.url, "https://www.igdb.com/game_modes/single-player")
        assertEquals(baseData.checksum, "1cc07088-c5fb-3cb2-9e68-af6620c18836")
    }
}