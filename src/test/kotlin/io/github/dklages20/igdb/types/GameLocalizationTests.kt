package io.github.dklages20.igdb.types

import io.github.dklages20.igdb.runBaseObjectTest
import io.github.dklages20.igdb.runExpandedObjectTest
import io.github.dklages20.igdb.runIdOnlyObjectTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class GameLocalizationTests {

    @Test
    fun testIdOnly() {
        val idOnlyData = runIdOnlyObjectTest(GameLocalization::class)
        assertEquals(idOnlyData.id, 1292)
    }

    @Test
    fun testBaseData() {
        val baseData = runBaseObjectTest(GameLocalization::class)
        assertEquals(baseData.id, 1292)
        assertEquals(baseData.name, "タイニーズズズ！")
        assertEquals(baseData.game?.id, 216293)
        assertEquals(baseData.region?.id, 3)
        assertEquals(baseData.createdAt, 1662781167)
        assertEquals(baseData.updatedAt, 1662945458)
        assertEquals(baseData.checksum, "f1bc4aad-57f5-927c-64d9-b1c7c609f097")
    }

    @Test
    fun testExpanded() {
        runExpandedObjectTest(GameLocalization::class)
    }
}
