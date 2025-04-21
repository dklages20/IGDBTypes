package io.github.dklages20.igdb.types

import io.github.dklages20.igdb.runBaseObjectTest
import io.github.dklages20.igdb.runIdOnlyObjectTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class WebsiteTypeTests {

    @Test
    fun testIdOnly() {
        val idOnlyData = runIdOnlyObjectTest(WebsiteType::class)
        assertEquals(idOnlyData.id, 2)
    }

    @Test
    fun testBaseData() {
        val baseData = runBaseObjectTest(WebsiteType::class)
        assertEquals(baseData.id, 2)
        assertEquals(baseData.type, "Community Wiki")
        assertEquals(baseData.createdAt, 1742385157)
        assertEquals(baseData.updatedAt, 1742385157)
        assertEquals(baseData.checksum, "9083a203-985b-65f7-3d70-fa1977e46003")
    }
}