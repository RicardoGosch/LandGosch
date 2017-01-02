package net.fycraft.model;

import java.util.ArrayList;

import org.bukkit.Chunk;

public class Land {
	/*
	 * Model Land
	 */
	private Integer id;
	private String name;
	private Location location;
	private ArrayList<Chunk> chunk;
	private ArrayList<Member> member;

	/*
	 * Construtor
	 */
	public Land() {
		
	}

	/*
	 * Getter and Setters
	 */
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public ArrayList<Chunk> getChunk() {
		return chunk;
	}

	public void setChunk(ArrayList<Chunk> chunk) {
		this.chunk = chunk;
	}

	public ArrayList<Member> getMember() {
		return member;
	}

	public void setMember(ArrayList<Member> member) {
		this.member = member;
	}

}
