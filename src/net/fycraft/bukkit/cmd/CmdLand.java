package net.fycraft.bukkit.cmd;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CmdLand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		/*
		 * TODO Comand responsável pela administração do plugin
		 * 
		 * USE: /<command> [controller] [args]
		 * 
		 * <command> = [land, terreno]
		 * 
		 */

		// Verifica se o SENDER é um PLAYER
		if (!(sender instanceof Player))
			return true;

		Integer length = args.length;

		if (length == 0) {
			// Abre o menu gui

			return true;
		}
		if (length == 1) {
			/*
			 * [controller]
			 * 
			 * Info: Mostra forma de uso do controller
			 * 
			 * Uso: /<command> [controller]
			 * 
			 */

			return true;
		}

		if (length == 2) {
			/*
			 * 
			 * Uso: /<command> [controller] [args]
			 * 
			 */
			return true;
		}

		if (length >= 3) {
			/*
			 * Mostra modo de uso do /<command>
			 */
		}

		return true;
	}

}
