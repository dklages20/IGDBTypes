package io.github.dklages20.igdb.types

import io.github.dklages20.igdb.runBaseObjectTest
import io.github.dklages20.igdb.runExpandedObjectTest
import io.github.dklages20.igdb.runIdOnlyObjectTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ExternalGameTests {

    @Test
    fun testIdOnly() {
        val idOnlyData = runIdOnlyObjectTest(ExternalGame::class)
        assertEquals(idOnlyData.id, 2972312)
    }

    @Test
    fun testBaseData() {
        val baseData = runBaseObjectTest(ExternalGame::class)
        assertEquals(baseData.id, 2972312)
        assertEquals(baseData.category, ExternalGame.Category.STEAM)
        assertEquals(baseData.createdAt, 1735419879)
        assertEquals(baseData.game?.id, 327405)
        assertEquals(baseData.name, "Megabonk")
        assertEquals(baseData.uid, "3405340")
        assertEquals(baseData.updatedAt, 1743053464)
        assertEquals(baseData.url, "https://store.steampowered.com/app/3405340")
        assertEquals(baseData.checksum, "8e12e538-8ee0-7820-f6b6-6cd951b2bb6b")
        assertEquals(baseData.externalGameSource?.id, 1)
    }
    @Test
    fun testExpanded() {
        runExpandedObjectTest(ExternalGame::class)
    }
}