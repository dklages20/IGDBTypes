package io.github.dklages20.igdb.types.deserializers

import io.github.dklages20.igdb.types.InvolvedCompany

class InvolvedCompanyDeserializer: IGDBObjectDeserializer<InvolvedCompany>(InvolvedCompany::class)
class InvolvedCompanyListDeserializer: IGDBObjectListDeserializer<InvolvedCompany>(InvolvedCompanyDeserializer())