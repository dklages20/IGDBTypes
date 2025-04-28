package io.github.dklages20.igdb.types

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import io.github.dklages20.igdb.types.deserializers.CompanyDeserializer
import io.github.dklages20.igdb.types.deserializers.GameDeserializer

class InvolvedCompany(
    id: Int,
    val checksum: String?,
    @JsonDeserialize(using = CompanyDeserializer::class)
    val company: Company?,
    val createdAt: Long?,
    val developer: Boolean?,
    @JsonDeserialize(using = GameDeserializer::class)
    val game: Game?,
    val porting: Boolean?,
    val publisher: Boolean?,
    val supporting: Boolean?,
    val updatedAt: Long?,
): IGDBBaseObject(id) {

    constructor(id: Int): this(id, null, null, null, null, null, null, null, null, null)

    override fun toString(): String {
        return "InvolvedCompany(id=$id, checksum=$checksum, company=$company, createdAt=$createdAt, developer=$developer, game=$game, porting=$porting, publisher=$publisher, supporting=$supporting, updatedAt=$updatedAt)"
    }
}