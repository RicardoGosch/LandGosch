package net.fycraft.bukkit.event;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import net.fycraft.bukkit.LandGoschPlugin;
import net.fycraft.dao.Land;
import net.fycraft.eventhandler.PlayerLoginEvent;

public class EvtPlayerLogin implements Listener {

	private LandGoschPlugin plugin;

	public EvtPlayerLogin(LandGoschPlugin plugin) {
		this.plugin = plugin;
	}

	@EventHandler
	public void onPlayerLogin(PlayerLoginEvent e) {
		plugin.addLand(Land.list(e.getPlayer()));
	}

}
