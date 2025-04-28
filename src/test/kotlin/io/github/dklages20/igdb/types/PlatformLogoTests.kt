package io.github.dklages20.igdb.types

import io.github.dklages20.igdb.runBaseObjectTest
import io.github.dklages20.igdb.runIdOnlyObjectTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class PlatformLogoTests {

    @Test
    fun testIdOnly() {
        val idOnlyData = runIdOnlyObjectTest(PlatformLogo::class)
        assertEquals(idOnlyData.id, 561)
    }

    @Test
    fun testBaseData() {
        val baseData = runBaseObjectTest(PlatformLogo::class)
        assertEquals(baseData.id, 561)
        assertEquals(baseData.alphaChannel, true)
        assertEquals(baseData.animated, false)
        assertEquals(baseData.height, 1200)
        assertEquals(baseData.imageId, "plfl")
        assertEquals(baseData.url, "//images.igdb.com/igdb/image/upload/t_thumb/plfl.jpg")
        assertEquals(baseData.width, 1200)
        assertEquals(baseData.checksum, "e5da8929-5f66-47e0-6004-7e661416fbbd")
    }
}