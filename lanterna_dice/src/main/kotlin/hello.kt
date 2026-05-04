import com.googlecode.lanterna.terminal.DefaultTerminalFactory
import com.googlecode.lanterna.screen.TerminalScreen

fun main() {
    val screen = DefaultTerminalFactory()
        .createScreen()

    screen.startScreen()

    val g = screen.newTextGraphics()

    g.putString(5, 3, "Hello, Lanterna!")

    screen.refresh()
    Thread.sleep(2000)
    screen.stopScreen()

}