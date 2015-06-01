package uk.nfell2009.serverstats;

import org.bukkit.plugin.java.JavaPlugin;

public class ServerStats extends JavaPlugin {

	public static ServerStats plugin;
	
	@Override
	public void onEnable() {
		plugin = this;
		
	}
	
	public void onDisable() {
		plugin = null;
	}
	
	public ServerStats getInstance() {
		return plugin;
	}
	
}
