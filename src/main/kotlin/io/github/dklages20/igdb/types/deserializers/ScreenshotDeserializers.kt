package io.github.dklages20.igdb.types.deserializers

import io.github.dklages20.igdb.types.Screenshot

class ScreenshotDeserializer: IGDBObjectDeserializer<Screenshot>(Screenshot::class)
class ScreenshotListDeserializer: IGDBObjectListDeserializer<Screenshot>(ScreenshotDeserializer())