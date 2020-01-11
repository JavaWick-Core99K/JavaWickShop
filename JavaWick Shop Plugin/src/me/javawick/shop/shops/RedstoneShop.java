package me.javawick.shop.shops;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import me.javawick.shop.inventory.Shop;
import me.javawick.util.item.Stack;

public class RedstoneShop extends Shop {
	
	public RedstoneShop() {
		
		super("redstone shop", "&lRedstone Shop", 6);
		
		// Redstone
		ItemStack redstone = Stack.createDefaultItem(Material.REDSTONE, 4);
		super.setItem(redstone, 1, true, false, 0);
		
		// Hopper
		ItemStack hopper = Stack.createDefaultItem(Material.HOPPER, 1);
		super.setItem(hopper, 4, true, false, 1);
		
		// Dropper
		ItemStack dropper = Stack.createDefaultItem(Material.DROPPER, 1);
		super.setItem(dropper, 4, true, false, 2);
		
		// Observer
		ItemStack observer = Stack.createDefaultItem(Material.OBSERVER, 1);
		super.setItem(observer, 4, true, false, 3);
		
		// Comparator
		ItemStack comparator = Stack.createDefaultItem(Material.COMPARATOR, 1);
		super.setItem(comparator, 3, true, false, 4);
		
		// Global market navigator
		ItemStack sign = Stack.createItemName(Material.OAK_SIGN, 1, "&f&lGlobal Market");
		super.setItem(sign, 0, false, true, 53);
	}

}
