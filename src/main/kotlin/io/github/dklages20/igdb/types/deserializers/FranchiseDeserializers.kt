package io.github.dklages20.igdb.types.deserializers

import io.github.dklages20.igdb.types.Franchise

class FranchiseDeserializer: IGDBObjectDeserializer<Franchise>(Franchise::class)
class FranchiseListDeserializer: IGDBObjectListDeserializer<Franchise>(FranchiseDeserializer())
