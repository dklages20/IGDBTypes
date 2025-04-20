package io.github.dklages20.igdb.types.deserializers

import io.github.dklages20.igdb.types.CollectionMembership

class CollectionMembershipDeserializer : IGDBObjectDeserializer<CollectionMembership>(CollectionMembership::class)
class CollectionMembershipListDeserializer : IGDBObjectListDeserializer<CollectionMembership>(CollectionMembershipDeserializer())