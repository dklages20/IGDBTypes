package io.github.dklages20.igdb.types

import com.fasterxml.jackson.annotation.JsonAlias
import com.fasterxml.jackson.annotation.JsonValue

class PlatformVersionReleaseDate(
    id: Int,
    val category: Category?,
    val checksum: String?,
    val createdAt: Long?,
    val date: Long?,
    val dateFormat: DateFormat?,
    val human: String?,
    @JsonAlias("m")
    val month: Integer?,
    val platformVersion: PlatformVersion?,
    val region: Region?,
    val releaseRegion: ReleaseDateRegion?,
    val updatedAt: Long?,
    @JsonAlias("y")
    val year: Int?
): IGDBBaseObject(id) {

    constructor(id: Int): this(id, null, null, null, null, null, null, null, null, null, null, null, null)

    enum class Category(val value: Int) {
        YYYYMMMMDD(0),
        YYYYMMMM(1),
        YYYY(2),
        YYYYQ1(3),
        YYYYQ2(4),
        YYYYQ3(5),
        YYYYQ4(6),
        TBD(7);

        @JsonValue
        fun toValue(): Int = value

        companion object {
            fun fromValue(value: Int): Category? {
                return Category.entries.find { it.value == value }
            }
        }
    }

    enum class Region(val value: Int) {
        EUROPE(1),
        NORTH_AMERICA(2),
        AUSTRALIA(3),
        NEW_ZEALAND(4),
        JAPAN(5),
        CHINA(6),
        ASIA(7),
        WORLDWIDE(8),
        KOREA(9),
        BRAZIL(10);

        @JsonValue
        fun toValue(): Int = value

        companion object {
            fun fromValue(value: Int): Region? {
                return Region.entries.find { it.value == value }
            }
        }
    }

    override fun toString(): String {
        return "PlatformVersionReleaseDate(id=$id, category=$category, checksum=$checksum, createdAt=$createdAt, date=$date, dateFormat=$dateFormat, human=$human, month=$month, platformVersion=$platformVersion, region=$region, releaseRegion=$releaseRegion, updatedAt=$updatedAt, year=$year)"
    }
}