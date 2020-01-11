package me.javawick.shop.shops;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import me.javawick.shop.inventory.Shop;
import me.javawick.util.item.Stack;

public class ToolShop extends Shop {

	public ToolShop() {
		
		super("tool shop", "&lTool Shop", 6);
		
		/* FIRST ROW */
		// Iron pickaxe
		ItemStack ironPick = Stack.createDefaultItem(Material.IRON_PICKAXE, 1);
		super.setItem(ironPick, 20, true, false, 0);
		
		// Iron axe
		ItemStack ironAxe = Stack.createDefaultItem(Material.IRON_AXE, 1);
		super.setItem(ironAxe, 20, true, false, 1);
		
		// Iron shovel
		ItemStack ironShovel = Stack.createDefaultItem(Material.IRON_SHOVEL, 1);
		super.setItem(ironShovel, 7, true, false, 2);
		
		
		
		/* SECOND ROW */
		// Diamond pickaxe
		ItemStack diamondPick = Stack.createDefaultItem(Material.DIAMOND_PICKAXE, 1);
		super.setItem(diamondPick, 290, true, false, 9);
		
		// Diamond axe
		ItemStack diamondAxe = Stack.createDefaultItem(Material.DIAMOND_AXE, 1);
		super.setItem(diamondAxe, 290, true, false, 10);
		
		// Diamond shovel
		ItemStack diamondShovel = Stack.createDefaultItem(Material.DIAMOND_SHOVEL, 1);
		super.setItem(diamondShovel, 90, true, false, 11);
		
		
		
		/* THIRD ROW */
		// Gold pickaxe
		ItemStack goldPick = Stack.createDefaultItem(Material.GOLDEN_PICKAXE, 1);
		super.setItem(goldPick, 13, true, false, 18);
		
		// Gold axe
		ItemStack goldAxe = Stack.createDefaultItem(Material.GOLDEN_AXE, 1);
		super.setItem(goldAxe, 13, true, false, 19);
		
		// Gold shovel
		ItemStack goldShovel = Stack.createDefaultItem(Material.GOLDEN_SHOVEL, 1);
		super.setItem(goldShovel, 3, true, false, 20);
		
		// Global market navigator
		ItemStack sign = Stack.createItemName(Material.OAK_SIGN, 1, "&f&lGlobal Market");
		super.setItem(sign, 0, false, true, 53);
	}
}
