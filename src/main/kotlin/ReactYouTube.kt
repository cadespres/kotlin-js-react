@file:JsModule("react-youtube-lite")
@file:JsNonModule

import react.*

external interface ReactYouTubeProps : RProps {
    var url: String
}

@JsName("ReactYouTubeLite")
external val reactPlayer: RClass<ReactYouTubeProps>