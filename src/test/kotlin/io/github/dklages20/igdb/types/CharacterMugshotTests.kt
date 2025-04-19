package io.github.dklages20.igdb.types

import io.github.dklages20.igdb.runBaseObjectTest
import io.github.dklages20.igdb.runIdOnlyObjectTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CharacterMugshotTests {

    @Test
    fun testIdOnly() {
        val idOnlyData = runIdOnlyObjectTest(CharacterMugshot::class)
        assertEquals(idOnlyData.id, 3554)
    }

    @Test
    fun testBase() {
        val baseData = runBaseObjectTest(CharacterMugshot::class)
        assertEquals(baseData.id, 3554)
        assertEquals(baseData.checksum, "544a77c6-064c-5911-38c6-a240d81aed5a")
        assertEquals(baseData.imageId, "hkulihu7z8g4mjjriwag")
        assertEquals(baseData.url, "//images.igdb.com/igdb/image/upload/t_thumb/hkulihu7z8g4mjjriwag.jpg")
        assertEquals(baseData.width, 832)
        assertEquals(baseData.height, 1080)
    }
}
