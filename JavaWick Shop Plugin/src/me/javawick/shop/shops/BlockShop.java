package me.javawick.shop.shops;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import me.javawick.shop.inventory.Shop;
import me.javawick.util.item.Stack;

public class BlockShop extends Shop {

	public BlockShop() {

		super("block shop", "&lBlock Shop", 6);
		
		int i = 0;
		
		// Dirt
		ItemStack dirt = Stack.createDefaultItem(Material.DIRT, 64);
		super.setItem(dirt, 2, true, false, i);
		i++;

		// Cobblestone
		ItemStack cobble = Stack.createDefaultItem(Material.COBBLESTONE, 64);
		super.setItem(cobble, 5, true, false, i);
		i++;
		
		// Global market navigator
		ItemStack sign = Stack.createItemName(Material.OAK_SIGN, 1, "&f&lGlobal Market");
		super.setItem(sign, 0, false, true, 53);
	}
}
