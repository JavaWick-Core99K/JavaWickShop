package me.javawick.shop.shops;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

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

		// Unbreakable Elytra
		ItemStack unlimitedElytra = new ItemStack(Material.ELYTRA);
		ItemMeta meta = unlimitedElytra.getItemMeta();
		meta.setUnbreakable(true);
		unlimitedElytra.setItemMeta(meta);
		super.setItem(unlimitedElytra, 3000, true, false, i);
		i++;

		// Rails
		ItemStack rails = new ItemStack(Material.RAIL, 64);
		super.setItem(rails, 64, true, false, i);
		i++;

		// Powered rails
		ItemStack pRails = new ItemStack(Material.POWERED_RAIL, 6);
		super.setItem(pRails, 12, true, false, i);
		i++;

		// Minecart
		ItemStack minecart = new ItemStack(Material.MINECART, 1);
		super.setItem(minecart, 25, true, false, i);
		i++;

		// Global market navigator
		ItemStack sign = Stack.createItemName(Material.OAK_SIGN, 1, "&f&lGlobal Market");
		super.setItem(sign, 0, false, true, 53);
	}
}
