package me.javawick.shop.shops;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import me.javawick.shop.inventory.Shop;
import me.javawick.util.item.Stack;

public class TradeShop extends Shop {

	public TradeShop() {

		super("trade shop", "&lTrade Shop", 6);
		super.setTrade(true);
		
		int i = 0;

		// Gunpowder
		ItemStack gunPowder = Stack.createDefaultItem(Material.GUNPOWDER, 1);
		super.setItem(gunPowder, 1, true, false, i);
		i++;

		// Rotten flesh
		ItemStack flesh = Stack.createDefaultItem(Material.ROTTEN_FLESH, 2);
		super.setItem(flesh, 1, true, false, i);
		i++;

		// Stick
		ItemStack stick = Stack.createDefaultItem(Material.STICK, 32);
		super.setItem(stick, 4, true, false, i);
		i++;
		
		// Sugar cane
		ItemStack sugarCane = Stack.createDefaultItem(Material.SUGAR_CANE, 4);
		super.setItem(sugarCane, 3, true, false, i);
		i++;
		
		// Wheat
		ItemStack wheat = Stack.createDefaultItem(Material.WHEAT, 3);
		super.setItem(wheat, 2, true, false, i);
		i++;
		
		// Carrot
		ItemStack carrot = Stack.createDefaultItem(Material.CARROT, 3);
		super.setItem(carrot, 2, true, false, i);
		i++;
		
		// Potato
		ItemStack potato = Stack.createDefaultItem(Material.POTATO, 3);
		super.setItem(potato, 2, true, false, i);
		i++;
		
		// Beetroot
		ItemStack beet = Stack.createDefaultItem(Material.BEETROOT, 3);
		super.setItem(beet, 2, true, false, i);
		i++;
		
		// Melon
		ItemStack melon = Stack.createDefaultItem(Material.MELON, 1);
		super.setItem(melon, 10, true, false, i);
		i++;
		
		// Pumpkin
		ItemStack pumpkin = Stack.createDefaultItem(Material.PUMPKIN, 1);
		super.setItem(pumpkin, 5, true, false, i);
		i++;
		
		// Ink sac
		ItemStack ink = Stack.createDefaultItem(Material.INK_SAC, 1);
		super.setItem(ink, 6, true, false, i);
		i++;

		// Coal
		ItemStack coal = Stack.createDefaultItem(Material.COAL, 2);
		super.setItem(coal, 1, true, false, i);
		i++;

		// Diamond
		ItemStack diamond = Stack.createDefaultItem(Material.DIAMOND, 1);
		super.setItem(diamond, 95, true, false, i);
		i++;
		
		// Emerald
		ItemStack emerald = Stack.createDefaultItem(Material.EMERALD, 1);
		super.setItem(emerald, 90, true, false, i);
		i++;
		
		// Dirt
		ItemStack dirt = Stack.createDefaultItem(Material.DIRT, 64);
		super.setItem(dirt, 2, true, false, i);
		i++;

		// Cobblestone
		ItemStack cobble = Stack.createDefaultItem(Material.COBBLESTONE, 64);
		super.setItem(cobble, 5, true, false, i);
		i++;
		
		// Oak log
		ItemStack oakLog = Stack.createDefaultItem(Material.OAK_LOG, 8);
		super.setItem(oakLog, 8, true, false, i);
		i++;
		
		// Spruce log
		ItemStack spruceLog = Stack.createDefaultItem(Material.SPRUCE_LOG, 8);
		super.setItem(spruceLog, 8, true, false, i);
		i++;
		
		// Birch log
		ItemStack birchLog = Stack.createDefaultItem(Material.BIRCH_LOG, 8);
		super.setItem(birchLog, 8, true, false, i);
		i++;
		
		// Jungle log
		ItemStack jungleLog = Stack.createDefaultItem(Material.JUNGLE_LOG, 8);
		super.setItem(jungleLog, 8, true, false, i);
		i++;
		
		// Acacia log
		ItemStack acaciaLog = Stack.createDefaultItem(Material.ACACIA_LOG, 8);
		super.setItem(acaciaLog, 8, true, false, i);
		i++;
		
		// Dark oak log
		ItemStack darkOakLog = Stack.createDefaultItem(Material.DARK_OAK_LOG, 8);
		super.setItem(darkOakLog, 8, true, false, i);
		i++;
		
		// Global market navigator
		ItemStack sign = Stack.createItemName(Material.OAK_SIGN, 1, "&f&lGlobal Market");
		super.setItem(sign, 0, false, true, 53);

	}

}
