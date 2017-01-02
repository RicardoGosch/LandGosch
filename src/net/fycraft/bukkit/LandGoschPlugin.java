package net.fycraft.bukkit;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import net.fycraft.bukkit.cmd.CmdLand;
import net.fycraft.bukkit.event.EvtPlayerMove;
import net.fycraft.model.Land;

public class LandGoschPlugin extends JavaPlugin {

	private ArrayList<ArrayList<Land>> landList;
	
	@Override
	public void onLoad() {
		
	}

	@Override
	public void onEnable() {
		commands();
		listener();
	}

	@Override
	public void onDisable() {
		
	}

	private void commands() {
		getCommand("terreno").setExecutor(new CmdLand());
		getCommand("land").setExecutor(new CmdLand());
	}

	private void listener() {
		Bukkit.getServer().getPluginManager().registerEvents(new EvtPlayerMove(), this);
	}
	
	public void addLand(ArrayList<Land> land){
		landList.add(land);
	}
}
