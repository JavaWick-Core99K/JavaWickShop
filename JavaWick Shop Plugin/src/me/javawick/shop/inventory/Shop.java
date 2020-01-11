package me.javawick.shop.inventory;

import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import me.javawick.util.inventory.CustomGui;

public class Shop {

	private ShopItem[] shopItems;
	private CustomGui gui;
	private boolean tradeable;
	
	public Shop(String name, String displayName, int rows) {
		gui = new CustomGui(name, displayName, rows);
		shopItems = new ShopItem[gui.getSize()];
		tradeable = false;
	}
	
	/**
	 * Gets the inventory title of the shop
	 * 
	 * @return String - the title
	 */
	public String getTitle() {
		return gui.getDisplayName();
	}
	
	/**
	 * Gets the inventory of the shop
	 * 
	 * @return Inventory - the inventory
	 */
	public Inventory getInventory() {
		return gui.inv();
	}
	
	/**
	 * Gets the array of ShopItem objects
	 * 
	 * @return ShopItem[] - the array
	 */
	public ShopItem[] getShopItems() {
		return shopItems;
	}
	
	/**
	 * Get the ShopItem object specified at the slot
	 * 
	 * @param slot - index of the inventory
	 * @return ShopItem - the object
	 */
	public ShopItem getShopItem(int slot) {
		return shopItems[slot];
	}
	
	/**
	 * Get the ItemStack specified at the slot
	 * 
	 * @param slot - index of the inventory
	 * @return ItemStack - the item
	 */
	public ItemStack getItem(int slot) {
		return shopItems[slot].getItem();
	}
	
	/**
	 * Get the display ItemStack specified at the slot
	 * 
	 * @param slot - index of the inventory
	 * @return ItemStack - the item
	 */
	public ItemStack getDisplayItem(int slot) {
		return shopItems[slot].getDisplayItem();
	}
	
	/**
	 * Sees if this shop is a tradeable shop
	 * 
	 * @return true - if tradeable
	 */
	public boolean canTrade() {
		return tradeable;
	}
	
	/**
	 * Sets an item into the specified inventory slot
	 * 
	 * @param i - the ItemStack
	 * @param cost - the price of the item
	 * @param canSell - is this item on sale?
	 * @param navigator - is this item a navigation item?
	 * @param slot - the slot of the inventory
	 */
	public void setItem(ItemStack i, int cost, boolean canSell, boolean navigator, int slot) {
		shopItems[slot] = new ShopItem(i, cost, canSell, navigator);
		
		ItemStack[] items = gui.getItems();
		items[slot] = shopItems[slot].getDisplayItem();
		
		gui.setItems(items);
	}
	
	/**
	 * Sets to where this item should navigate to
	 * 
	 * @param shop - the shop to open
	 * @param index - the slot location of the item
	 * @return Shop - this shop
	 */
	public Shop setNavigate(Shop shop, int index) {
		shopItems[index].setNavigate(shop);
		return this;
	}
	
	/**
	 * Sets the shop to a tradeable state
	 * 
	 * @param t - the condition
	 * @return boolean - the condition
	 */
	public boolean setTrade(boolean t) {
		tradeable = t;
		return tradeable;
	}
	
}
