import org.bukkit.Bukkit
import org.bukkit.plugin.java.JavaPlugin

class YourPlugin: JavaPlugin() {
    override fun onEnable() {
        Bukkit.getConsoleSender().sendMessage("Hello world!")
    }

    override fun onDisable() {
        Bukkit.getConsoleSender().sendMessage("Goodbye world!")
    }
}
