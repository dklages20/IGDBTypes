package io.github.dklages20.igdb.types

import io.github.dklages20.igdb.runBaseObjectTest
import io.github.dklages20.igdb.runExpandedObjectTest
import io.github.dklages20.igdb.runIdOnlyObjectTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CollectionMembershipTests {

    @Test
    fun testIdOnly() {
        val idOnlyData = runIdOnlyObjectTest(CollectionMembership::class)
        assertEquals(idOnlyData.id, 1006)
    }

    @Test
    fun testBaseData() {
        val baseData = runBaseObjectTest(CollectionMembership::class)
        assertEquals(baseData.id, 1006)
        assertEquals(baseData.game?.id, 225512)
        assertEquals(baseData.collection?.id, 8409)
        assertEquals(baseData.type?.id, 1)
        assertEquals(baseData.updatedAt, 1696835502)
        assertEquals(baseData.createdAt, 1696692556)
        assertEquals(baseData.checksum, "e090f827-0062-737f-5d23-914fae5e9f13")
    }

    @Test
    fun testExpanded() {
        runExpandedObjectTest(CollectionMembership::class)
    }
}
