package io.github.dklages20.igdb.types

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.databind.PropertyNamingStrategies
import com.fasterxml.jackson.databind.annotation.JsonNaming


@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy::class)
open class IGDBBaseObject(val id: Int) {
    @JsonAnyGetter
    @JsonAnySetter
    val unrecognizedProperties: MutableMap<String?, Any?> = LinkedHashMap()
}
