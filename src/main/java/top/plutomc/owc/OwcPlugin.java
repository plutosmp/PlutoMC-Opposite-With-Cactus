package top.plutomc.owc;

import org.bukkit.plugin.java.JavaPlugin;

public final class OwcPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new PlayerListener(), this);
    }
}