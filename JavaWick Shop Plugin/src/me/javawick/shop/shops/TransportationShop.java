package me.javawick.shop.shops;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import me.javawick.shop.inventory.Shop;
import me.javawick.util.item.Stack;

public class TransportationShop extends Shop {

	public TransportationShop() {

		super("transportation shop", "&lTransportation Shop", 6);

		int i = 0;

		// Elytra
		ItemStack elytra = new ItemStack(Material.ELYTRA);
		super.setItem(elytra, 750, true, false, i);
		i++;

		// Rails
		ItemStack rails = new ItemStack(Material.RAIL, 16);
		super.setItem(rails, 30, true, false, i);
		i++;

		// Powered rails
		ItemStack pRails = new ItemStack(Material.POWERED_RAIL, 6);
		super.setItem(pRails, 15, true, false, i);
		i++;
		
		// Minecart
		ItemStack minecart = new ItemStack(Material.MINECART, 1);
		super.setItem(minecart, 28, true, false, i);
		i++;

		// Global market navigator
		ItemStack sign = Stack.createItemName(Material.OAK_SIGN, 1, "&f&lGlobal Market");
		super.setItem(sign, 0, false, true, 53);
	}
}
