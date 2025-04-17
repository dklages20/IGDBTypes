package io.github.dklages20.igdb.types

import io.github.dklages20.igdb.runBaseObjectTest
import io.github.dklages20.igdb.runExpandedObjectTest
import io.github.dklages20.igdb.runIdOnlyObjectTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CoverTests {

    @Test
    fun testIdOnly() {
        val idOnlyData = runIdOnlyObjectTest(Cover::class)
        assertEquals(idOnlyData.id, 65483)
    }

    @Test
    fun testBaseData() {
        val baseData = runBaseObjectTest(Cover::class)
        assertEquals(baseData.id, 65483)
        assertEquals(baseData.game?.id, 100547)
        assertEquals(baseData.height, 800)
        assertEquals(baseData.width, 1260)
        assertEquals(baseData.imageId, "pkkd08qhfxt5cosp3hra")
        assertEquals(baseData.url, "//images.igdb.com/igdb/image/upload/t_thumb/pkkd08qhfxt5cosp3hra.jpg")
        assertEquals(baseData.checksum, "e09f916b-04fe-8993-594e-b18435438a35")
    }

    @Test
    fun testExpanded() {
        runExpandedObjectTest(Cover::class)
    }
}
