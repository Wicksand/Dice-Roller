import com.googlecode.lanterna.terminal.DefaultTerminalFactory
import com.googlecode.lanterna.TextColor

fun main() {
    val screen = DefaultTerminalFactory()
        .createScreen()
    screen.startScreen()

    val g = screen.newTextGraphics()

    g.setForegroundColor(TextColor.ANSI.GREEN)
    g.setBackgroundColor(TextColor.ANSI.BLACK)
    g.putString(2,1,"TEST TEXT 1")

    screen.refresh()
    Thread.sleep(2000)
    screen.stopScreen()

}