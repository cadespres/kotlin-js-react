import kotlinx.browser.window
import kotlinx.html.js.onClickFunction
import react.*
import react.dom.*

data class Video(
    val id: Int,
    val title: String,
    val speaker: String,
    val url: String
)

external interface VideoListProps: RProps {
    var videos: List<Video>
}

@JsExport
class VideoList: RComponent<VideoListProps, RState>() {
    override fun RBuilder.render() {
        for (video in props.videos) {
            p {
                key = video.id.toString()
                attrs {
                    onClickFunction = {
                        window.alert("Clicked $video!")
                    }
                }
                +"${video.speaker}: ${video.title}"
            }
        }
    }
}
// This is great
fun RBuilder.videoList(handler: VideoListProps.() -> Unit): ReactElement {
    return child(VideoList::class) {
        this.attrs(handler)
    }
}