import androidx.compose.ui.window.ComposeUIViewController
import ru.ladgertha.irregular_verbs.App
import platform.UIKit.UIViewController

fun MainViewController(): UIViewController {
    return ComposeUIViewController { App() }
}
