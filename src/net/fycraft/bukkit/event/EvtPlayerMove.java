package net.fycraft.bukkit.event;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class EvtPlayerMove implements Listener {

	public EvtPlayerMove() {
		// TODO Auto-generated constructor stub
	}
	
	@EventHandler (priority = EventPriority.HIGH)
	public void onPlayerMove(PlayerMoveEvent event){
		
	}
}
