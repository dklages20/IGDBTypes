package io.github.dklages20.igdb.types

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.databind.PropertyNamingStrategies
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonNaming
import io.github.dklages20.igdb.types.deserializers.AgeRatingListDeserializer
import io.github.dklages20.igdb.types.deserializers.AlternativeNameListDeserializer
import io.github.dklages20.igdb.types.deserializers.ArtworkListDeserializer
import io.github.dklages20.igdb.types.deserializers.CollectionDeserializer
import io.github.dklages20.igdb.types.deserializers.CollectionListDeserializer
import io.github.dklages20.igdb.types.deserializers.CoverDeserializer
import io.github.dklages20.igdb.types.deserializers.ExternalGameListDeserializer
import io.github.dklages20.igdb.types.deserializers.FranchiseDeserializer
import io.github.dklages20.igdb.types.deserializers.GameDeserializer
import io.github.dklages20.igdb.types.deserializers.GameEngineListDeserializer
import io.github.dklages20.igdb.types.deserializers.GameListDeserializer
import io.github.dklages20.igdb.types.deserializers.GameLocalizationListDeserializer
import io.github.dklages20.igdb.types.deserializers.GameModeListDeserializer
import io.github.dklages20.igdb.types.deserializers.GameStatusDeserializer
import io.github.dklages20.igdb.types.deserializers.GameTypeDeserializer
import io.github.dklages20.igdb.types.deserializers.GameVideoListDeserializer
import io.github.dklages20.igdb.types.deserializers.GenreListDeserializer
import io.github.dklages20.igdb.types.deserializers.InvolvedCompanyListDeserializer
import io.github.dklages20.igdb.types.deserializers.KeywordListDeserializer
import io.github.dklages20.igdb.types.deserializers.LanguageSupportListDeserializer
import io.github.dklages20.igdb.types.deserializers.MultiplayerModeListDeserializer
import io.github.dklages20.igdb.types.deserializers.PlatformListDeserializer
import io.github.dklages20.igdb.types.deserializers.PlayerPerspectiveListDeserializer
import io.github.dklages20.igdb.types.deserializers.ThemeListDeserializer
import io.github.dklages20.igdb.types.deserializers.WebsiteListDeserializer

@JsonIgnoreProperties(ignoreUnknown = true)
class Game(
    id: Int,
    @JsonDeserialize(using = AgeRatingListDeserializer::class)
    val ageRatings: List<AgeRating>?,
    val aggregatedRating: Double?,
    val aggregatedRatingCount: Int?,
    @JsonDeserialize(using = AlternativeNameListDeserializer::class)
    val alternativeNames: List<AlternativeName>?,
    @JsonDeserialize(using = ArtworkListDeserializer::class)
    val artworks: List<Artwork>?,
    @JsonDeserialize(using = GameListDeserializer::class)
    val bundles: List<Game>?,
    val category: Category?,
    val checksum: String?,
    @JsonDeserialize(using = CollectionDeserializer::class)
    val collection: Collection?,
    @JsonDeserialize(using = CollectionListDeserializer::class)
    val collections: List<Collection>?,
    @JsonDeserialize(using = CoverDeserializer::class)
    val cover: Cover?,
    val createdAt: Long?,
    @JsonDeserialize(using = GameListDeserializer::class)
    val dlcs: List<Game>?,
    @JsonDeserialize(using = GameListDeserializer::class)
    val expandedGames: List<Game>?,
    @JsonDeserialize(using = GameListDeserializer::class)
    val expansions: List<Game>?,
    @JsonDeserialize(using = ExternalGameListDeserializer::class)
    val externalGames: List<ExternalGame>?,
    val firstReleaseDate: Long?,
    val follows: Int?,
    @JsonDeserialize(using = GameListDeserializer::class)
    val forks: List<Game>?,
    @JsonDeserialize(using = FranchiseDeserializer::class)
    val franchise: Franchise?,
    @JsonDeserialize(using = GameEngineListDeserializer::class)
    val gameEngines: List<GameEngine>?,
    @JsonDeserialize(using = GameLocalizationListDeserializer::class)
    val gameLocalizations: List<GameLocalization>?,
    @JsonDeserialize(using = GameModeListDeserializer::class)
    val gameModes: List<GameMode>?,
    @JsonDeserialize(using = GameStatusDeserializer::class)
    val gameStatus: GameStatus?,
    @JsonDeserialize(using = GameTypeDeserializer::class)
    val gameType: GameType?,
    @JsonDeserialize(using = GenreListDeserializer::class)
    val genres: List<Genre>?,
    val hypes: Int?,
    @JsonDeserialize(using = InvolvedCompanyListDeserializer::class)
    val involvedCompanies: List<InvolvedCompany>?,
    @JsonDeserialize(using = KeywordListDeserializer::class)
    val keywords: List<Keyword>?,
    @JsonDeserialize(using = LanguageSupportListDeserializer::class)
    val languageSupports: List<LanguageSupport>?,
    @JsonDeserialize(using = MultiplayerModeListDeserializer::class)
    val multiplayerModes: List<MultiplayerMode>?,
    val name: String?,
    @JsonDeserialize(using = GameDeserializer::class)
    val parentGame: Game?,
    @JsonDeserialize(using = PlatformListDeserializer::class)
    val paltforms: List<Platform>?,
    @JsonDeserialize(using = PlayerPerspectiveListDeserializer::class)
    val playerPerspectives: List<PlayerPerspective>?,
    @JsonDeserialize(using = GameListDeserializer::class)
    val ports: List<Game>?,
    val rating: Double?,
    val ratingCount: Int?,
    val releaseDates: List<ReleaseDate>?,
    @JsonDeserialize(using = GameListDeserializer::class)
    val remakes: List<Game>?,
    @JsonDeserialize(using = GameListDeserializer::class)
    val remasters: List<Game>?,
    val screenshots: List<Screenshot>?,
    @JsonDeserialize(using = GameListDeserializer::class)
    val similarGames: List<Game>?,
    val slug: String?,
    @JsonDeserialize(using = GameListDeserializer::class)
    val standaloneExpressions: List<Game>?,
    val status: Status?,
    val storyline: String?,
    val summary: String?,
    val tags: List<Int>?,
    @JsonDeserialize(using = ThemeListDeserializer::class)
    val themes: List<Theme>?,
    val totalRating: Double?,
    val totalRatingCount: Int?,
    val updatedAt: Long?,
    val url: String?,
    @JsonDeserialize(using = GameDeserializer::class)
    val versionParent: Game?,
    val versionTitle: String?,
    @JsonDeserialize(using = GameVideoListDeserializer::class)
    val videos: List<GameVideo>?,
    @JsonDeserialize(using = WebsiteListDeserializer::class)
    val websites: List<Website>?,
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
    )

    enum class Category(val value: Int) {
        MAIN(0),
        DLC(1),
        EXPANSION(2),
        BUNDLE(3),
        STANDALONE_EXPANSION(4),
        MOD(5),
        EPISODE(6),
        SEASON(7),
        REMAKE(8),
        REMASTER(9),
        EXPANDED_GAME(10),
        PORT(11),
        FORK(12),
        PACK(13),
        UPDATE(14);

        @JsonValue
        fun toValue(): Int = value

        companion object {
            fun fromValue(value: Int): Category? {
                return Category.entries.find { it.value == value }
            }
        }
    }

    enum class Status(val value: Int) {
        RELEASED(0),
        ALPHA(2),
        BETA(3),
        EARLY_ACCESS(4),
        OFFLINE(5),
        CANCELLED(6),
        RUMORED(7),
        DELISTED(8);

        @JsonValue
        fun toValue(): Int = value

        companion object {
            fun fromValue(value: Int): Status? {
                return Status.entries.find { it.value == value }
            }
        }
    }
}
