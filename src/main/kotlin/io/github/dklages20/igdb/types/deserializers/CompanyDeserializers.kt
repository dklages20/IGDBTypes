package io.github.dklages20.igdb.types.deserializers

import io.github.dklages20.igdb.types.Company

class CompanyDeserializer: IGDBObjectDeserializer<Company>(Company::class)
class CompanyListDeserializer: IGDBObjectListDeserializer<Company>(CompanyDeserializer())