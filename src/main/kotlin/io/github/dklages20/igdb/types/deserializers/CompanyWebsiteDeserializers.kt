package io.github.dklages20.igdb.types.deserializers

import io.github.dklages20.igdb.types.CompanyWebsite

class CompanyWebsiteDeserializer: IGDBObjectDeserializer<CompanyWebsite>(CompanyWebsite::class)
class CompanyWebsiteListDeserializer: IGDBObjectListDeserializer<CompanyWebsite>(CompanyWebsiteDeserializer())