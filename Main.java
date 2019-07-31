package me.MutatedOrange.FirstPlugin;

import org.bukkit.plugin.java.JavaPlugin;

import me.MutatedOrange.FirstPlugin.commands.DingDong;
import me.MutatedOrange.FirstPlugin.commands.Joinmsg;
import me.MutatedOrange.FirstPlugin.commands.Showoff;
import me.MutatedOrange.FirstPlugin.commands.buildtasks;



public class Main extends JavaPlugin {
	
	String consoleprefix = "[FirstPlugin]: ";
	String igprefix = "§1[§bFirstPlugin§1]§7: §e";

	public void onEnable() {
		System.out.println(consoleprefix + "(!) First Plugin is a success! (!)");
		getServer().getPluginManager().registerEvents(new Joinmsg(), this);
		this.getCommand("dingdong").setExecutor(new DingDong());
		this.getCommand("showoff").setExecutor(new Showoff());
		this.getCommand("buildtasks").setExecutor(new buildtasks());
		
		getConfig().options().copyDefaults(true);
		saveConfig();
		reloadConfig();
	}
	
	public void onDisable() {
		System.out.println(consoleprefix + "(!) First Plugin shutting down... :( (!)");
	}
	
	

}