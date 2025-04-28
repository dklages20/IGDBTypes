package io.github.dklages20.igdb.types

import io.github.dklages20.igdb.runBaseObjectTest
import io.github.dklages20.igdb.runIdOnlyObjectTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class GameEngineTests {

    @Test
    fun testIdOnly() {
        val idOnlyData = runIdOnlyObjectTest(GameEngine::class)
        assertEquals(idOnlyData.id, 220)
    }

    @Test
    fun testBaseData() {
        val baseData = runBaseObjectTest(GameEngine::class)
        assertEquals(baseData.id, 220)
        assertEquals(baseData.createdAt, 1428923145)
        assertEquals(baseData.updatedAt, 1742199811)
        assertEquals(baseData.name, "Vicious Engine")
        assertEquals(baseData.slug, "vicious-engine")
        assertEquals(baseData.url, "https://www.igdb.com/game_engines/vicious-engine")
        assertEquals(baseData.checksum, "0f880f96-6dbb-f697-023c-23a6ad46c4d8")
    }
}