import react.dom.*
import kotlinx.browser.document

external interface Video {
    val id: Int
    val title: String
    val speaker: String
    val videoUrl: String
}

fun main() {
    render(document.getElementById("root")) {
        child(App::class) {}
    }
}