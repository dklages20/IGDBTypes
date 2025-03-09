package io.github.dklages20.igdb.types

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.databind.PropertyNamingStrategies
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonNaming
import io.github.dklages20.igdb.types.deserializers.AgeRatingCategoryDeserializer
import io.github.dklages20.igdb.types.deserializers.AgeRatingContentDescriptionDeserializer
import io.github.dklages20.igdb.types.deserializers.AgeRatingContentDescriptionV2Deserializer
import io.github.dklages20.igdb.types.deserializers.OrganizationDeserializer

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy::class)
@JsonIgnoreProperties(ignoreUnknown = true)
class AgeRating(
    id: Int,
    val checksum: String?,
    val category: Category?,
    @JsonDeserialize(using = AgeRatingContentDescriptionDeserializer::class)
    val contentDescriptions: List<AgeRatingContentDescription> = listOf(),
    @JsonDeserialize(using = OrganizationDeserializer::class)
    val organization: AgeRatingOrganization?,
    val rating: Rating?,
    @JsonDeserialize(using = AgeRatingCategoryDeserializer::class)
    val ratingCategory: AgeRatingCategory?,
    @JsonDeserialize(using = AgeRatingContentDescriptionV2Deserializer::class)
    val ratingContentDescriptions: List<AgeRatingContentDescriptionV2> = listOf(),
    val ratingCoverUrl: String?,
    val synopsis: String?,
) : IGDBBaseObject(id) {

    override fun toString(): String {
        return "AgeRating=(id=$id, checksum=$checksum, category=$category, contentDescriptions=$contentDescriptions, organization=$organization, rating=$rating, ratingCategory=$ratingCategory, ratingContentDescriptions=$ratingContentDescriptions, ratingCoverUrl=$ratingCoverUrl, synopsis=$synopsis)"
    }

    enum class Category(val value: Int) {
        ESRB(1),
        PEGI(2),
        CERO(3),
        USK(4),
        GRAC(5),
        CLASS_IND(6),
        ACB(7);

        @JsonValue
        fun toValue(): Int = value

        companion object {
            fun fromValue(value: Int): Rating? {
                return Rating.entries.find { it.value == value }
            }
        }
    }

    enum class Rating(val value: Int) {
        THREE(1),
        SEVEN(2),
        TWELVE(3),
        SIXTEEN(4),
        EIGHTEEN(5),
        RP(6),
        EC(7),
        E(8),
        E10(9),
        T(10),
        M(11),
        AO(12),
        CERO_A(13),
        CERO_B(14),
        CERO_C(15),
        CERO_D(16),
        CERO_Z(17),
        USK_0(18),
        USK_6(19),
        USK_12(20),
        USK_16(21),
        USK_18(22),
        GRAC_ALL(23),
        GRAC_TWELVE(24),
        GRAC_FIFTEEN(25),
        GRAC_EIGHTEEN(26),
        GRAC_TESTING(27),
        CLASS_IND_L(28),
        CLASS_IND_TEN(29),
        CLASS_IND_TWELVE(30),
        CLASS_IND_FOURTEEN(31),
        CLASS_IND_SIXTEEN(32),
        CLASS_IND_EIGHTEEN(33),
        ACB_G(34),
        ACB_PG(35),
        ACB_M(36),
        ACB_MA15(37),
        ACB_R18(38),
        ACB_RC(39);

        @JsonValue
        fun toValue(): Int = value

        companion object {
            fun fromValue(value: Int): Rating? {
                return entries.find { it.value == value }
            }
        }
    }
}
