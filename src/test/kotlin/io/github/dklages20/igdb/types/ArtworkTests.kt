package io.github.dklages20.igdb.types

import io.github.dklages20.igdb.runBaseObjectTest
import io.github.dklages20.igdb.runExpandedObjectTest
import io.github.dklages20.igdb.runIdOnlyObjectTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ArtworkTests {

    @Test
    fun testIdOnly() {
        val idOnlyData = runIdOnlyObjectTest(Artwork::class)
        assertEquals(idOnlyData.id, 5305)
    }

    @Test
    fun testBase() {
        val baseData = runBaseObjectTest(Artwork::class)
        assertEquals(baseData.id, 5305)
        assertEquals(baseData.height, 500)
        assertEquals(baseData.width, 800)
        assertEquals(baseData.checksum, "0dec6ec1-4e83-b93d-d44b-33761f81891f")
        assertEquals(baseData.imageId, "t0ufrugxdrbce8giwhvo")
        assertEquals(baseData.game?.id, 2039)
    }

    @Test
    fun testExpanded() {
        runExpandedObjectTest(Artwork::class)
    }
}
