package io.github.dklages20.igdb.types

import io.github.dklages20.igdb.runBaseObjectTest
import io.github.dklages20.igdb.runExpandedObjectTest
import io.github.dklages20.igdb.runIdOnlyObjectTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CollectionMembershipTypeTests {

    @Test
    fun testIdOnly() {
        val idOnlyData = runIdOnlyObjectTest(CollectionMembershipType::class)
        assertEquals(idOnlyData.id, 1)
    }

    @Test
    fun testBaseData() {
        val baseData = runBaseObjectTest(CollectionMembershipType::class)
        assertEquals(baseData.id, 1)
        assertEquals(baseData.name, "Member")
        assertEquals(baseData.description, "Normal membership(i.e. is a part of) for a game to have with  a series")
        assertEquals(baseData.allowedCollectionType?.id, 1)
        assertEquals(baseData.updatedAt, 1693384727)
        assertEquals(baseData.createdAt, 1691486869)
        assertEquals(baseData.checksum, "4a636c5f-5885-4ed9-b632-6356dbd48225")
    }

    @Test
    fun testExpanded() {
        runExpandedObjectTest(CollectionMembershipType::class)
    }
}
