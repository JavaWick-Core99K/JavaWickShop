package me.javawick.shop.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.javawick.shop.Main;
import me.javawick.util.chat.Color;

public class OpenShop implements CommandExecutor {

	private Main plugin;
	
	public OpenShop(Main pl) {
		plugin = pl;
		plugin.getCommand("shop").setExecutor(this);
	}

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if(!(sender instanceof Player)) {
			sender.sendMessage(Color.chat("&cOnly players can open shops"));
			return true;
		}
		
		if(args.length != 0)
			return false;
		
		Player p = (Player) sender;
		
		p.openInventory(plugin.getShop(0).getInventory());
		
		return true;
	}

}
