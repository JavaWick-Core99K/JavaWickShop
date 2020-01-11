package me.javawick.shop.shops;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;

import me.javawick.shop.inventory.Shop;
import me.javawick.util.item.Stack;

public class WeaponShop extends Shop {

	public WeaponShop() {
		
		super("weapon shop", "&lWeapon Shop", 6);
		
		/* FIRST ROW */
		// Iron sword
		ItemStack ironSword = Stack.createDefaultItem(Material.IRON_SWORD, 1);
		super.setItem(ironSword, 12, true, false, 0);
		
		// Iron sword ("Tier 1")
		ItemStack ironSword_tier1 = Stack.createItemLore(Material.IRON_SWORD, 1, "&b&lTier I");
		ironSword_tier1.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 3);
		super.setItem(ironSword_tier1, 25, true, false, 1);
		
		// Iron sword ("Tier 2")
		ItemStack ironSword_tier2 = Stack.createItemLore(Material.IRON_SWORD, 1, "&b&lTier II");
		ironSword_tier2.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 6);
		super.setItem(ironSword_tier2, 50, true, false, 2);
		
		// Iron sword ("Tier 3")
		ItemStack ironSword_tier3 = Stack.createItemLore(Material.IRON_SWORD, 1, "&b&lTier III");
		ironSword_tier3.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 10);
		super.setItem(ironSword_tier3, 75, true, false, 3);
		
		// Iron sword ("Tier 4")
		ItemStack ironSword_tier4 = Stack.createItemLore(Material.IRON_SWORD, 1, "&b&lTier IV");
		ironSword_tier4.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 10);
		ironSword_tier4.addUnsafeEnchantment(Enchantment.KNOCKBACK, 2);
		super.setItem(ironSword_tier4, 100, true, false, 4);
		
		
		
		/* SECOND ROW */
		// Diamond sword
		ItemStack dSword = Stack.createDefaultItem(Material.DIAMOND_SWORD, 1);
		super.setItem(dSword, 190, true, false, 9);
		
		// Diamond sword ("Tier 1")
		ItemStack dSword_tier1 = Stack.createItemLore(Material.DIAMOND_SWORD, 1, "&4&lTier I");
		dSword_tier1.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 3);
		super.setItem(dSword_tier1, 240, true, false, 10);
		
		// Diamond sword ("Tier 2")
		ItemStack dSword_tier2 = Stack.createItemLore(Material.DIAMOND_SWORD, 1, "&4&lTier II");
		dSword_tier2.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 6);
		super.setItem(dSword_tier2, 290, true, false, 11);
		
		// Diamond sword ("Tier 3")
		ItemStack dSword_tier3 = Stack.createItemLore(Material.DIAMOND_SWORD, 1, "&4&lTier III");
		dSword_tier3.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 10);
		super.setItem(dSword_tier3, 340, true, false, 12);
		
		
		
		/* THIRD ROW */
		// Golden sword
		ItemStack goldSword = Stack.createDefaultItem(Material.GOLDEN_SWORD, 1);
		super.setItem(goldSword, 8, true, false, 18);
		
		// Golden sword ("Tier 1")
		ItemStack goldSword_tier1 = Stack.createItemLore(Material.GOLDEN_SWORD, 1, "&f&lTier I");
		goldSword_tier1.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 3);
		super.setItem(goldSword_tier1, 28, true, false, 19);
		
		// Golden sword ("Tier 2")
		ItemStack goldSword_tier2 = Stack.createItemLore(Material.GOLDEN_SWORD, 1, "&f&lTier II");
		goldSword_tier2.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 6);
		super.setItem(goldSword_tier2, 48, true, false, 20);
		
		// Golden sword ("Tier 3")
		ItemStack goldSword_tier3 = Stack.createItemLore(Material.GOLDEN_SWORD, 1, "&f&lTier III");
		goldSword_tier3.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 10);
		super.setItem(goldSword_tier3, 68, true, false, 21);
		
		// Golden sword ("Tier 4")
		ItemStack goldSword_tier4 = Stack.createItemLore(Material.GOLDEN_SWORD, 1, "&f&lTier IV");
		goldSword_tier4.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 10);
		goldSword_tier4.addUnsafeEnchantment(Enchantment.KNOCKBACK, 2);
		goldSword_tier4.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 2);
		super.setItem(goldSword_tier4, 88, true, false, 22);
		
		
		
		/* FOURTH ROW */
		ItemStack arrows = Stack.createDefaultItem(Material.ARROW, 16);
		super.setItem(arrows, 16, true, false, 27);
		
		// Global market navigator
		ItemStack sign = Stack.createItemName(Material.OAK_SIGN, 1, "&f&lGlobal Market");
		super.setItem(sign, 0, false, true, 53);
	}
	
}
