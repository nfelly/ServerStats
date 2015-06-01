package uk.nfell2009.serverstats;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
//import net.foxgenesis.serverstats.PMCStats;

public class CommandListener implements CommandExecutor {

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("serverstats")) {
			if (args[0].isEmpty()) {
				sender.sendMessage(ChatColor.GOLD + "--------[ ServerStats Help ]--------");
				sender.sendMessage(ChatColor.GOLD + "/serverstats pmc");
				sender.sendMessage(ChatColor.GOLD + "/serverstats minestatus");
				sender.sendMessage(ChatColor.GOLD + "/serverstats mcsl");
				sender.sendMessage(ChatColor.GOLD + "/serverstats minecraft-mp");
				sender.sendMessage(ChatColor.GOLD + "/serverstats all");
				return false;
			} else if (args[0].equalsIgnoreCase("pmc")) {
				String url = new ServerStats().getInstance().getConfig().getString("settings.pmc.serverurl");
				sender.sendMessage(ChatColor.GOLD + "--------[ PMC Stats ]--------");
				/*sender.sendMessage(ChatColor.GOLD + "Total views: " + PMCStats(url).getTotalViews());
				sender.sendMessage(ChatColor.GOLD + "Todays views: " + PMCStats(url).getTodaysViews());
				sender.sendMessage(ChatColor.GOLD + "Diamonds: " + PMCStats(url).getDiamonds());
				sender.sendMessage(ChatColor.GOLD + "Server score: " + PMCStats(url).getServerScore());
				sender.sendMessage(ChatColor.GOLD + "Favourites: " + PMCStats(url).getFavourites());
				sender.sendMessage(ChatColor.GOLD + "Comments: " + PMCStats(url).getComments());*/
				sender.sendMessage(ChatColor.GOLD + "Server URL: " + url);
				return true;
			}
		}
		return false;
	}
	
}
