package io.github.dklages20.igdb.types.deserializers

import io.github.dklages20.igdb.types.CompanyStatus

class CompanyStatusDeserializer: IGDBObjectDeserializer<CompanyStatus>(CompanyStatus::class)
class CompanyStatusListDeserializer: IGDBObjectListDeserializer<CompanyStatus>(CompanyStatusDeserializer())