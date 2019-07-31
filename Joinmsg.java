package me.MutatedOrange.FirstPlugin.commands;

import java.util.ArrayList;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import me.MutatedOrange.FirstPlugin.Utils;

public class Joinmsg implements Listener{
	
	@EventHandler	
	public void onPlayerJoin(PlayerJoinEvent event) {
		
		Player player = event.getPlayer();
		event.setJoinMessage("§eWelcome, §6" + event.getPlayer().getName() + "!");
		
		ItemStack item = new ItemStack(Material.ORANGE_DYE, 1);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(Utils.chat("&6The &aMutated &6Orange"));
		ArrayList<String> lore = new ArrayList<String>();
		lore.add(Utils.chat("&e&kh&0&kh&b&kh&a&kh&5&kh&c&kh"));
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		player.getInventory().addItem(item);
		
	}		
}
