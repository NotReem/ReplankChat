package me.reem.replankchat;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class ReplankChat extends JavaPlugin {

    public static final String RANK = "";

    private static ReplankChat instance;

    @Override
    public void onEnable() {
        instance = this;
        getServer().getPluginManager().registerEvents(new me.reem.replankchat.events.ReplankChatEvents(), this);
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "[Chat]: Plugin is enabled!");
    }

    @Override
    public void onDisable() {
        instance = null;
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "[Chat]: Plugin is disabled!");
    }

    public static ReplankChat getInstance() {
        return instance;
    }
}