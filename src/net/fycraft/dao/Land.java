package net.fycraft.dao;

import java.util.ArrayList;

import org.bukkit.entity.Player;

public class Land {

	public static Boolean newer(Land land) {

		return true;
	}

	public static Boolean update(Land land) {

		return true;
	}

	public static Boolean delete(Integer id) {

		return true;
	}

	public static Land select(Integer id) {
		Land land = new Land();

		return land;
	}

	public static ArrayList<net.fycraft.model.Land> list(Player player) {
		ArrayList<net.fycraft.model.Land> land = new ArrayList<>();
		
		return land;
	}

}