import kotlinx.css.*
import react.*
import react.dom.h3
import react.dom.img
import styled.css
import styled.styledDiv

@JsExport
class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h3 {
            + "Unwatched videos"
        }
        // videolist fun is neat and fun
        videoList {
            videos = unwatchedVideos
        }
//        child(VideoList::class) {
//            attrs.videos = unwatchedVideos
//        }

        h3 {
            + "Watched videos"
        }
        videoList {
            videos = watchedVideos
        }

        styledDiv {
            css {
                position = Position.absolute
                top = 10.px
                right = 10.px
            }
            h3 {
                +"John Doe: Building and breaking things"
            }
            img {
                attrs {
                    src = "https://via.placeholder.com/640x360.png?text=Video+Player+Placeholder"
                }
            }
        }
    }
}