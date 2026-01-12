package me.ako.simpleSMPUtility.listeners;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerGameModeChangeEvent;
import org.bukkit.event.player.PlayerInteractEvent;

// Name 'nerdCheat' taken from agmass/PrisonGame
public class nerdCheatGamemodeListener implements Listener {
    @EventHandler
    public void onNerdCheat(PlayerGameModeChangeEvent e) {
        Player p = e.getPlayer();
        String newGamemode = e.getNewGameMode().toString();
        String playerName = p.getName();
        if (newGamemode.equalsIgnoreCase("creative")) {
            Bukkit.broadcastMessage(ChatColor.DARK_RED + playerName + " has changed gamemode to Creative.");
            Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "gamemode survival " + playerName);
            Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "deop " + playerName);
        }
        if (newGamemode.equalsIgnoreCase("spectator")) {
            Bukkit.broadcastMessage(ChatColor.DARK_RED + playerName + " has changed gamemode to Spectator.");
            Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "gamemode survival " + playerName);
            Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "deop " + playerName);
        }
        if (newGamemode.equalsIgnoreCase("survival")) {
            Bukkit.broadcastMessage(ChatColor.DARK_RED + playerName + " has changed gamemode to Survival.");

        }
    }
}
