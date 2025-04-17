package io.github.dklages20.igdb.types

import io.github.dklages20.igdb.runBaseObjectTest
import io.github.dklages20.igdb.runExpandedObjectTest
import io.github.dklages20.igdb.runIdOnlyObjectTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CollectionTests {

    @Test
    fun testIdOnly() {
        val idOnlyData = runIdOnlyObjectTest(Collection::class)
        assertEquals(idOnlyData.id, 1056)
    }

    @Test
    fun testBase() {
        val baseData = runBaseObjectTest(Collection::class)
        assertEquals(baseData.id, 1056)
        assertEquals(baseData.name, "Bubsy")
        assertEquals(baseData.slug, "bubsy")
        assertEquals(baseData.createdAt, 1411988955)
        assertEquals(baseData.updatedAt, 1720750235)
        assertEquals(baseData.url, "https://www.igdb.com/collections/bubsy")
        assertEquals(baseData.checksum, "facd1ff9-7dca-a79c-2f4c-e9e0b8b79834")
        assertEquals(baseData.type?.id, 1)
        assertEquals(
            baseData.games.map { it.id }, listOf(
                7803,
                7804,
                7805,
                7806,
                33965,
                36868,
                70261,
                111558,
                306587,
                307065
            )
        )
    }

    @Test
    fun testExpanded() {
        runExpandedObjectTest(Collection::class)
    }
}
