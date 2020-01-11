package me.javawick.shop.shops;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import me.javawick.shop.inventory.Shop;
import me.javawick.util.item.Stack;

public class FoodShop extends Shop {
	
	public FoodShop() {
		
		super("food shop", "&lFood Shop", 6);
		
		// Apple
		ItemStack apple = Stack.createDefaultItem(Material.APPLE, 1);
		super.setItem(apple, 1, true, false, 0);
		
		// Golden apple
		ItemStack goldApple = Stack.createDefaultItem(Material.GOLDEN_APPLE, 1);
		super.setItem(goldApple, 35, true, false, 1);
		
		// Enchanted golden apple
		ItemStack enchGoldApple = Stack.createDefaultItem(Material.ENCHANTED_GOLDEN_APPLE, 1);
		super.setItem(enchGoldApple, 310, true, false, 2);
		
		// Global market navigator
		ItemStack sign = Stack.createItemName(Material.OAK_SIGN, 1, "&f&lGlobal Market");
		super.setItem(sign, 0, false, true, 53);
	}

}
