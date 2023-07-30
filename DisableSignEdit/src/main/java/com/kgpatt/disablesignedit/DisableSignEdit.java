package com.kgpatt.disablesignedit;

import com.kgpatt.disablesignedit.Listeners.SignListener;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public final class DisableSignEdit extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getLogger().info("DisableSignEdit - Enabled");
        getServer().getPluginManager().registerEvents((Listener)new SignListener(), (Plugin)this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
