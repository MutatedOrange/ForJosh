package me.MutatedOrange.FirstPlugin.commands;

import java.util.ArrayList;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

import me.MutatedOrange.FirstPlugin.Utils;

public class buildtasks implements Listener, CommandExecutor {

	ArrayList<String> buildTasks = new ArrayList<String>();

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

		Player player = (Player) sender;
		int amtOfArgs = args.length;
		StringBuilder sb = new StringBuilder("");
		if (args.length == 0) {
			player.sendMessage(Utils.chat("&cYou must specify a message!"));
		} else if (args[0].equalsIgnoreCase("add") && (player.hasPermission("fp.buildtasks.add"))) {

			buildTasks.add(args[1]);
			player.sendMessage(Utils.chat("&2The build task: &a" + args[1] + "&2 has been added!"));

		} else if (args[0].equalsIgnoreCase("remove") && (player.hasPermission("fp.buildtasks.remove"))) {

			buildTasks.remove(args[1]);
			player.sendMessage(Utils.chat("&cThe build task: &4" + args[1] + "&c has been removed"));

		} else if (args[0].equalsIgnoreCase("list") && (player.hasPermission("fp.buildtasks.list"))) {

			sb.append(buildTasks + ", ");

			String outPut = String.join(", ", buildTasks);
			player.sendMessage(outPut);
		} else if (amtOfArgs >= 3) {

			player.sendMessage(Utils.chat("&cToo many Arguments! Usage: &e/buildtasks &aadd&e/&4remove &5<&dMessage-With-No-Spaces!&5>"));

		}
		return true;
	}

}
