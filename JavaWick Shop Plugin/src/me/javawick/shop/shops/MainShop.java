package me.javawick.shop.shops;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import me.javawick.shop.inventory.Shop;
import me.javawick.util.item.Stack;

public class MainShop extends Shop {

	public MainShop() {
		
		super("global market", "&lGlobal Market", 6);
		
		// Food shop navigator
		ItemStack food = Stack.createItemName(Material.BREAD, 1, "&6&lFood Shop");
		super.setItem(food, 0, false, true, 0);
		super.getShopItem(0).setNavigate(new FoodShop());
		
		// Weapon shop navigator
		ItemStack weapon = Stack.createItemName(Material.IRON_SWORD, 1, "&b&lWeapon Shop");
		super.setItem(weapon, 0, false, true, 8);
		super.getShopItem(8).setNavigate(new WeaponShop());
		
		// Tool shop navigator
		ItemStack tool = Stack.createItemName(Material.IRON_PICKAXE, 1, "&d&lTool Shop");
		super.setItem(tool, 0, false, true, 17);
		super.getShopItem(17).setNavigate(new ToolShop());
		
		// Material shop navigator
		ItemStack material = Stack.createItemName(Material.COAL, 1, "&f&lMaterial Shop");
		super.setItem(material, 0, false, true, 1);
		super.getShopItem(1).setNavigate(new MaterialShop());
		
		// Redstone shop navigator
		ItemStack redstone = Stack.createItemName(Material.REDSTONE, 1, "&c&lRedstone Shop");
		super.setItem(redstone, 0, false, true, 2);
		super.getShopItem(2).setNavigate(new RedstoneShop());
		
		// Block shop navigator
		ItemStack block = Stack.createItemName(Material.GRASS_BLOCK, 1, "&e&lBlock Shop");
		super.setItem(block, 0, false, true, 9);
		super.getShopItem(9).setNavigate(new BlockShop());
		
		// Transportation shop navigator
		ItemStack rail = Stack.createItemName(Material.RAIL, 1, "&f&lTransportation Shop");
		super.setItem(rail, 0, false, true, 10);
		super.getShopItem(10).setNavigate(new TransportationShop());
		
		// Trade shop navigator
		ItemStack trade = Stack.createItemName(Material.EMERALD, 1, "&a&lTrade Shop");
		super.setItem(trade, 0, false, true, 45);
		super.getShopItem(45).setNavigate(new TradeShop());
		
	}

}
