package me.javawick.shop.shops;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import me.javawick.shop.inventory.Shop;
import me.javawick.util.item.Stack;

public class MaterialShop extends Shop {
	
	public MaterialShop() {
		
		super("material shop", "&lMaterial Shop", 6);
		
		// Coal
		ItemStack coal = Stack.createDefaultItem(Material.COAL, 2);
		super.setItem(coal, 1, true, false, 0);
		
		// Iron ingot
		ItemStack ironIngot = Stack.createDefaultItem(Material.IRON_INGOT, 2);
		super.setItem(ironIngot, 15, true, false, 1);
		
		// Gold ingot
		ItemStack goldIngot = Stack.createDefaultItem(Material.GOLD_INGOT, 2);
		super.setItem(goldIngot, 10, true, false, 2);
		
		// Diamond
		ItemStack diamond = Stack.createDefaultItem(Material.DIAMOND, 1);
		super.setItem(diamond, 100, true, false, 3);
		
		// Lapis
		ItemStack lapis = Stack.createDefaultItem(Material.LAPIS_LAZULI, 2);
		super.setItem(lapis, 7, true, false, 4);
		
		// Global market navigator
		ItemStack sign = Stack.createItemName(Material.OAK_SIGN, 1, "&f&lGlobal Market");
		super.setItem(sign, 0, false, true, 53);
	}

}
