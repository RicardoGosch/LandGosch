package net.fycraft.model;

import org.bukkit.entity.Player;

public class Member {

	private Type type;
	private Player player;
	
	/*
	 * Construtor
	 */
	public Member() {

	}

	/*
	 * Getter and Setters
	 */
	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}
	
	public String toString(){
		return player.getName() + " is " + type.toString();
	}
	
	
	
}
