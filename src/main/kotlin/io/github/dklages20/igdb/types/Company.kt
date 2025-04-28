package io.github.dklages20.igdb.types

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import io.github.dklages20.igdb.types.deserializers.CompanyDeserializer
import io.github.dklages20.igdb.types.deserializers.CompanyLogoDeserializer
import io.github.dklages20.igdb.types.deserializers.CompanyStatusDeserializer
import io.github.dklages20.igdb.types.deserializers.CompanyWebsiteDeserializer
import io.github.dklages20.igdb.types.deserializers.CompanyWebsiteListDeserializer
import io.github.dklages20.igdb.types.deserializers.DateFormatDeserializer
import io.github.dklages20.igdb.types.deserializers.GameListDeserializer

class Company(
    id: Int,
    val changeDate: Long?,
    val changeDateCategory: ChangeDateCategory?,
    val changeDateFormat: DateFormat?,
    @JsonDeserialize(using = CompanyDeserializer::class)
    val changedCompanyId: Company?,
    val checksum: String?,
    val country: Int?,
    val createdAt: Long?,
    val description: String?,
    @JsonDeserialize(using = GameListDeserializer::class)
    val developed: List<Game>?,
    @JsonDeserialize(using = CompanyLogoDeserializer::class)
    val logo: CompanyLogo?,
    val name: String?,
    @JsonDeserialize(using = CompanyDeserializer::class)
    val parent: Company?,
    @JsonDeserialize(using = GameListDeserializer::class)
    val published: List<Game>?,
    val slug: String?,
    val startDate: Long?,
    val startDateCategory: StartDateCategory?,
    @JsonDeserialize(using = DateFormatDeserializer::class)
    val startDateFormat: DateFormat?,
    @JsonDeserialize(using = CompanyStatusDeserializer::class)
    val status: CompanyStatus?,
    val updatedAt: Long?,
    val url: String?,
    @JsonDeserialize(using = CompanyWebsiteListDeserializer::class)
    val websites: List<CompanyWebsite>?
) : IGDBBaseObject(id) {

    constructor(id: Int) : this(
        id,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null
    )

    enum class StartDateCategory(val value: Int) {
        YYYYMMMMDD(0),
        YYYYMMMM(1),
        YYYY(2),
        YYYYQ1(3),
        YYYYQ2(4),
        YYYYQ3(5),
        YYYYQ4(6),
        TBD(7);

        companion object {
            fun fromValue(value: Int): StartDateCategory? {
                return StartDateCategory.entries.find { it.value == value }
            }
        }
    }

    enum class ChangeDateCategory(val value: Int) {
        YYYYMMMMDD(0),
        YYYYMMMM(1),
        YYYY(2),
        YYYYQ1(3),
        YYYYQ2(4),
        YYYYQ3(5),
        YYYYQ4(6),
        TBD(7);

        companion object {
            fun fromValue(value: Int): ChangeDateCategory? {
                return ChangeDateCategory.entries.find { it.value == value }
            }
        }
    }

    override fun toString(): String {
        return "Company(id=$id, changeDate=$changeDate, changeDateCategory=$changeDateCategory, changeDateFormat=$changeDateFormat, changedCompanyId=$changedCompanyId, checksum=$checksum, country=$country, createdAt=$createdAt, description=$description, developed=$developed, logo=$logo, name=$name, parent=$parent, published=$published, slug=$slug, startDate=$startDate, startDateCategory=$startDateCategory, startDateFormat=$startDateFormat, status=$status, updatedAt=$updatedAt, url=$url, websites=$websites)"
    }
}