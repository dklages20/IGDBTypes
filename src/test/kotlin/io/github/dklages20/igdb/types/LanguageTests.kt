package io.github.dklages20.igdb.types

import io.github.dklages20.igdb.runBaseObjectTest
import io.github.dklages20.igdb.runIdOnlyObjectTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LanguageTests {

    @Test
    fun testIdOnly() {
        val idOnlyData = runIdOnlyObjectTest(Language::class)
        assertEquals(idOnlyData.id, 1)
    }

    @Test
    fun testBaseData() {
        val baseData = runBaseObjectTest(Language::class)
        assertEquals(baseData.id, 1)
        assertEquals(baseData.name, "Arabic")
        assertEquals(baseData.nativeName, "العربية")
        assertEquals(baseData.locale, "ar")
        assertEquals(baseData.createdAt, 1664803639)
        assertEquals(baseData.updatedAt, 1664803639)
        assertEquals(baseData.checksum, "e0963ddc-1e01-32e2-a959-d5ccda50410c")
    }
}