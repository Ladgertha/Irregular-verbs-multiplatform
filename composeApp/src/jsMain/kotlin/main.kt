import ru.ladgertha.irregular_verbs.App
import org.jetbrains.skiko.wasm.onWasmReady

fun main() {
    onWasmReady {
        BrowserViewportWindow("IrregularVerbsApp") {
            App()
        }
    }
}
