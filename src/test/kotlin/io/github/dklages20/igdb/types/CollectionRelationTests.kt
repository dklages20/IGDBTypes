package io.github.dklages20.igdb.types

import io.github.dklages20.igdb.runBaseObjectTest
import io.github.dklages20.igdb.runExpandedObjectTest
import io.github.dklages20.igdb.runIdOnlyObjectTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CollectionRelationTests {
    @Test
    fun testIdOnly() {
        val idOnlyData = runIdOnlyObjectTest(CollectionRelation::class)
        assertEquals(idOnlyData.id, 4)
    }

    @Test
    fun testBase() {
        val baseData = runBaseObjectTest(CollectionRelation::class)
        assertEquals(baseData.id, 4)
        assertEquals(baseData.childCollection?.id, 7649)
        assertEquals(baseData.parentCollection?.id, 380)
        assertEquals(baseData.type?.id, 2)
        assertEquals(baseData.updatedAt, 1700126861)
        assertEquals(baseData.createdAt, 1700126861)
        assertEquals(baseData.checksum, "2851ce94-296a-f90e-bea8-66cff1df205b")
    }

    @Test
    fun testExpanded() {
        runExpandedObjectTest(CollectionRelation::class)
    }
}
