package io.github.dklages20.igdb.types

import io.github.dklages20.igdb.runBaseObjectTest
import io.github.dklages20.igdb.runIdOnlyObjectTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CharacterSpeciesTests {

    @Test
    fun testIdOnly() {
        val idOnlyData = runIdOnlyObjectTest(CharacterSpecie::class)
        assertEquals(idOnlyData.id, 1)
    }

    @Test
    fun testBase() {
        val baseData = runBaseObjectTest(CharacterSpecie::class)
        assertEquals(baseData.id, 1)
        assertEquals(baseData.checksum, "550e8400-e29b-41d4-a716-446655440001")
        assertEquals(baseData.createdAt, 1738022400)
        assertEquals(baseData.updatedAt, 1738022400)
        assertEquals(baseData.name, "Human")
    }
}
