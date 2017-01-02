package net.fycraft.model;

public class Location {

	private org.bukkit.Location first;
	private org.bukkit.Location last;

	/*
	 * Construtor
	 */
	public Location(org.bukkit.Location first, org.bukkit.Location last) {
		this.first = first;
		this.last = last;
	}

	/*
	 * Getter and Setters
	 */
	public org.bukkit.Location getFirst() {
		return first;
	}

	public void setFirst(org.bukkit.Location first) {
		this.first = first;
	}

	public org.bukkit.Location getLast() {
		return last;
	}

	public void setLast(org.bukkit.Location last) {
		this.last = last;
	}

}
