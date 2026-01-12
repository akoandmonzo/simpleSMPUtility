package me.ako.simpleSMPUtility;

import me.ako.simpleSMPUtility.listeners.nerdCheatGamemodeListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class SimpleSMPUtility extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("SimpleSMPUtility has been enabled.");
        Bukkit.getPluginManager().registerEvents(new nerdCheatGamemodeListener(), this);
        System.out.println("Gamemode Change Check Active");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
