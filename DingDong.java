package me.MutatedOrange.FirstPlugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import me.MutatedOrange.FirstPlugin.Utils;
public class DingDong implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (label.equalsIgnoreCase("dingdong")) {
		if (sender instanceof Player) {
			Player player = (Player) sender;
		 	player.sendMessage(Utils.chat("&4Ding&6Dong!"));
		 	
		}
		
		else {
			sender.sendMessage("HEY! A player needs to use this you bafoon!");
		}
		}
		return true ;
	}

}
