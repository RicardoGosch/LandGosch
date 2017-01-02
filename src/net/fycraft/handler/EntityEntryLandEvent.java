package net.fycraft.handler;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import net.fycraft.model.Land;

public class EntityEntryLandEvent extends Event implements Cancellable {
	private static final HandlerList handlers = new HandlerList();

	private Boolean cancelled = false;
	private Land land;
	private Player player;

	public EntityEntryLandEvent(Land land, Player player) {
		this.land = land;
		this.player = player;
	}

	// Método obrigatório
	public HandlerList getHandlers() {
		return handlers;
	}

	// Método obrigatório
	public static HandlerList getHandlerList() {
		return handlers;
	}

	public boolean isCancelled() {
		return cancelled;
	}

	public void setCancelled(boolean cancelled) {
		this.cancelled = cancelled;
	}

	public Boolean getCancelled() {
		return cancelled;
	}

	public Land getLand() {
		return land;
	}

	public Player getPlayer() {
		return player;
	}
}
