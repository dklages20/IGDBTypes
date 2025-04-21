package io.github.dklages20.igdb.types

import io.github.dklages20.igdb.runBaseObjectTest
import io.github.dklages20.igdb.runExpandedObjectTest
import io.github.dklages20.igdb.runIdOnlyObjectTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class PlatformVersionTests {

    @Test
    fun testIdOnly() {
        val idOnlyData = runIdOnlyObjectTest(PlatformVersion::class)
        assertEquals(idOnlyData.id, 663)
    }

    @Test
    fun testBaseData() {
        val baseData = runBaseObjectTest(PlatformVersion::class)
        assertEquals(baseData.id, 663)
        assertEquals(baseData.name, "Opera GX")
        assertEquals(baseData.platformLogo?.id, 825)
        assertEquals(baseData.platformVersionReleaseDates?.map { it.id }, listOf(760))
        assertEquals(baseData.slug, "opera-gx")
        assertEquals(baseData.summary, "Opera GX is a gaming-oriented variant of Opera. The browser was announced and released in early access for Windows on 11 June 2019, during E3 2019. The macOS version was released in December of the same year.\n" +
                "\n" +
                "Opera GX adds features geared toward gamers on top of the regular Opera browser. The browser allows users to limit network, CPU, and memory usage to preserve system resources, with GX Cleaner, a tool that allows users to clear cache, cookies, and other unwanted files. It also adds integrations with other apps such as Twitch, Discord, Twitter, and Instagram. The browser also has a built-in page called the GX Corner, which collates gaming-related releases, deals, and news articles.")
        assertEquals(baseData.url, "https://www.igdb.com/platforms/browser/version/opera-gx")
        assertEquals(baseData.checksum, "9eba1d88-5e63-a5d0-b595-3e14c6423b34")
    }

    @Test
    fun testExpanded() {
        runExpandedObjectTest(PlatformVersion::class)
    }
}