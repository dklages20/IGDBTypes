package io.github.dklages20.igdb.types

import io.github.dklages20.igdb.runBaseObjectTest
import io.github.dklages20.igdb.runIdOnlyObjectTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class AgeRatingContentDescriptionTests {

    @Test
    fun testIdOnly() {
        val idOnlyData = runIdOnlyObjectTest(AgeRatingContentDescription::class)
        assertEquals(idOnlyData.id, 1)
    }

    @Test
    fun testBase() {
        val baseData = runBaseObjectTest(AgeRating::class)
        assertEquals(41302, baseData.id)
        assertEquals(AgeRating.Category.ESRB, baseData.category)
        assertEquals(AgeRating.Rating.fromValue(8), baseData.rating)
        assertEquals("494c694a-5a6d-be36-98f8-050e0dfa47f8", baseData.checksum)
        assertEquals(1, baseData.organization?.id)
        assertEquals(8, baseData.ratingCategory?.id)
        assertEquals(listOf(44647, 44648), baseData.contentDescriptions.map { it.id })
        assertEquals(listOf(1, 47), baseData.ratingContentDescriptions.map { it.id })
        assertEquals("https://images.igdb.com/igdb/image/upload/t_cover_big/co1x2e.jpg", baseData.ratingCoverUrl)
        assertEquals("The game contains a lot of blood and gore. The player can use a variety of weapons", baseData.synopsis)
    }

}
