package io.github.dklages20.igdb.types

import io.github.dklages20.igdb.runBaseObjectTest
import io.github.dklages20.igdb.runExpandedObjectTest
import io.github.dklages20.igdb.runIdOnlyObjectTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CharacterTests {

    @Test
    fun testIdOnly() {
        val idOnlyData = runIdOnlyObjectTest(Character::class)
        assertEquals(idOnlyData.id, 8303)
    }

    @Test
    fun testBase() {
        val baseData = runBaseObjectTest(Character::class)
        assertEquals(baseData.id, 8303)
        assertEquals(baseData.createdAt, 1462962430)
        assertEquals(baseData.games?.map { it.id }, listOf(4195))
        assertEquals(baseData.gender, Character.Gender.MALE)
        assertEquals(baseData.mugShot?.id, 3688)
        assertEquals(baseData.name, "Raven")
        assertEquals(baseData.slug, "raven")
        assertEquals(baseData.species, Character.Species.OTHER)
        assertEquals(baseData.updatedAt, 1483471464)
        assertEquals(baseData.url, "https://www.igdb.com/characters/raven")
        assertEquals(baseData.checksum, "aff6df00-ecbf-e915-f2b3-bb7d759d9f7f")
        assertEquals(baseData.characterGender?.id, 0)
        assertEquals(baseData.characterSpecies?.id, 5)
    }

    @Test
    fun testExpanded() {
        runExpandedObjectTest(Character::class)
    }
}
