package io.github.dklages20.igdb.types

import io.github.dklages20.igdb.runBaseObjectTest
import io.github.dklages20.igdb.runIdOnlyObjectTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CompanyLogoTests {

    @Test
    fun testIdOnly() {
        val idOnlyData = runIdOnlyObjectTest(CompanyLogo::class)
        assertEquals(idOnlyData.id, 968)
    }

    @Test
    fun testBaseData() {
        val baseData = runBaseObjectTest(CompanyLogo::class)
        assertEquals(baseData.id, 968)
        assertEquals(baseData.alphaChannel, false)
        assertEquals(baseData.animated, false)
        assertEquals(baseData.height, 187)
        assertEquals(baseData.imageId, "svplxuxn983cwmohg6w3")
        assertEquals(baseData.url, "//images.igdb.com/igdb/image/upload/t_thumb/svplxuxn983cwmohg6w3.jpg")
        assertEquals(baseData.width, 270)
        assertEquals(baseData.checksum, "abdd4770-9220-29f7-478d-71c0c0c27d39")
    }
}