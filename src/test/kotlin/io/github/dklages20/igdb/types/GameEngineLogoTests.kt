package io.github.dklages20.igdb.types

import io.github.dklages20.igdb.runBaseObjectTest
import io.github.dklages20.igdb.runIdOnlyObjectTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class GameEngineLogoTests {

    @Test
    fun testIdOnly() {
        val idOnlyData = runIdOnlyObjectTest(GameEngineLogo::class)
        assertEquals(idOnlyData.id, 397)
    }

    @Test
    fun testBaseData() {
        val baseData = runBaseObjectTest(GameEngineLogo::class)
        assertEquals(baseData.id, 397)
        assertEquals(baseData.alphaChannel, true)
        assertEquals(baseData.animated, false)
        assertEquals(baseData.height, 668)
        assertEquals(baseData.imageId, "geb1")
        assertEquals(baseData.url, "//images.igdb.com/igdb/image/upload/t_thumb/geb1.jpg")
        assertEquals(baseData.width, 800)
        assertEquals(baseData.checksum, "d8c26442-4958-44c9-2c94-d3d9e622d193")
    }
}