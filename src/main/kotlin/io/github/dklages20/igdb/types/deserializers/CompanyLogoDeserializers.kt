package io.github.dklages20.igdb.types.deserializers

import io.github.dklages20.igdb.types.CompanyLogo

class CompanyLogoDeserializer: IGDBObjectDeserializer<CompanyLogo>(CompanyLogo::class)
class CompanyLogoListDeserializer: IGDBObjectListDeserializer<CompanyLogo>(CompanyLogoDeserializer())