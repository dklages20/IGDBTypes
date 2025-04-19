package io.github.dklages20.igdb.types

import io.github.dklages20.igdb.runBaseObjectTest
import io.github.dklages20.igdb.runIdOnlyObjectTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CollectionTypeTests {
    @Test
    fun testIdOnly() {
        val idOnlyData = runIdOnlyObjectTest(CollectionType::class)
        assertEquals(idOnlyData.id, 1)
    }

    @Test
    fun testBase() {
        val baseData = runBaseObjectTest(CollectionType::class)
        assertEquals(baseData.id, 1)
        assertEquals(baseData.name, "Series")
        assertEquals(baseData.description, "Default collection type, used for all series for p0 of Serious Kiwi.")
        assertEquals(baseData.updatedAt, 1691486869)
        assertEquals(baseData.createdAt, 1691486869)
        assertEquals(baseData.checksum, "41c9125e-0333-d2da-4b3b-051e6f26189c")
    }

}
