package io.github.dklages20.igdb.types

import io.github.dklages20.igdb.runBaseObjectTest
import io.github.dklages20.igdb.runExpandedObjectTest
import io.github.dklages20.igdb.runIdOnlyObjectTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CollectionRelationTypeTests {
    @Test
    fun testIdOnly() {
        val idOnlyData = runIdOnlyObjectTest(CollectionRelationType::class)
        assertEquals(idOnlyData.id, 1)
    }

    @Test
    fun testBase() {
        val baseData = runBaseObjectTest(CollectionRelationType::class)
        assertEquals(baseData.id, 1)
        assertEquals(baseData.name, "Subseries")
        assertEquals(baseData.description, "A portion of a larger series that stands together")
        assertEquals(baseData.allowedChildType?.id, 1)
        assertEquals(baseData.allowedParentType?.id, 1)
        assertEquals(baseData.updatedAt, 1691486869)
        assertEquals(baseData.createdAt, 1691486869)
        assertEquals(baseData.checksum, "33cb4a87-ee3b-8b4e-4c0f-fda1adcd50b8")
    }

    @Test
    fun testExpanded() {
        runExpandedObjectTest(CollectionRelationType::class)
    }
}
