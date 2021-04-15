package me.reem.replankchat.commands;

import me.reem.replankchat.ReplankChat;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class RankCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player player = (Player) sender;
        if (!(sender instanceof Player)) {
            return true;
        }


        if (args.length >= 3) {
            try {
                int amount = Integer.parseInt(args[0]);
                player.sendMessage("§a[Ranks] Rank has been set!");
                for (int i = 0; i < amount ; i++) {
                    String rank = ReplankChat.RANK;


                }
            } catch (IllegalArgumentException e) {
                player.sendMessage(ChatColor.RED + "(!) That is not a valid rank! /rank set (player) (rank)");
            }
        } else {
            player.sendMessage(ChatColor.RED + "(!) /rank set (player) (rank)");
        }



        return true;
    }
}
