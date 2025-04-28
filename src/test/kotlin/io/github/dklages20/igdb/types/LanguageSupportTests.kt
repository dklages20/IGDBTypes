package io.github.dklages20.igdb.types

import io.github.dklages20.igdb.runBaseObjectTest
import io.github.dklages20.igdb.runExpandedObjectTest
import io.github.dklages20.igdb.runIdOnlyObjectTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LanguageSupportTests {

    @Test
    fun testIdOnly() {
        val idOnlyData = runIdOnlyObjectTest(LanguageSupport::class)
        assertEquals(idOnlyData.id, 1001)
    }

    @Test
    fun testBaseData() {
        val baseData = runBaseObjectTest(LanguageSupport::class)
        assertEquals(baseData.id, 1001)
        assertEquals(baseData.game?.id, 113494)
        assertEquals(baseData.language?.id, 7)
        assertEquals(baseData.languageSupportType?.id, 1)
        assertEquals(baseData.createdAt, 1667238652)
        assertEquals(baseData.updatedAt, 1667292163)
        assertEquals(baseData.checksum, "aa524ef6-ebe4-6ac9-b375-2b9c3849eba6")
    }

    @Test
    fun testExpanded() {
        runExpandedObjectTest(LanguageSupport::class)
    }
}