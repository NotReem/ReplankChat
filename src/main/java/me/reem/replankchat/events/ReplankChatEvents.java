package me.reem.replankchat.events;

import me.reem.replankchat.ReplankChat;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ReplankChatEvents implements Listener {

    @EventHandler
    public static void onAsyncPlayerChat(AsyncPlayerChatEvent event) {
        Player player = event.getPlayer();
        event.setCancelled(true);
        Bukkit.broadcastMessage(ReplankChat.RANK + " " + player.getName() + "§f" + event.getMessage());
    }

}