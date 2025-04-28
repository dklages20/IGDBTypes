package io.github.dklages20.igdb.types

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import io.github.dklages20.igdb.types.deserializers.CompanyListDeserializer
import io.github.dklages20.igdb.types.deserializers.GameEngineLogoDeserializer
import io.github.dklages20.igdb.types.deserializers.PlatformListDeserializer

class GameEngine(
    id: Int,
    val checksum: String?,
    @JsonDeserialize(using = CompanyListDeserializer::class)
    val companies: List<Company>?,
    val createdAt: Long?,
    val description: String?,
    @JsonDeserialize(using = GameEngineLogoDeserializer::class)
    val logo: GameEngineLogo?,
    val name: String?,
    @JsonDeserialize(using = PlatformListDeserializer::class)
    val platforms: List<Platform>?,
    val slug: String?,
    val updatedAt: Long?,
    val url: String?
): IGDBBaseObject(id) {
    constructor(id: Int): this(id, null, null, null, null, null, null, null, null, null, null)

    override fun toString(): String {
        return "GameEngine(id=$id, checksum=$checksum, companies=$companies, createdAt=$createdAt, description=$description, logo=$logo, name=$name, platforms=$platforms, slug=$slug, updatedAt=$updatedAt, url=$url)"
    }
}