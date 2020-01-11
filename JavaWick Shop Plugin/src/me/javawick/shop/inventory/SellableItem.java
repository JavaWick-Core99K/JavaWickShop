package me.javawick.shop.inventory;

import org.bukkit.inventory.ItemStack;

@Deprecated
public class SellableItem {

	private ItemStack item;
	private int amount;
	private int price;
	
	public SellableItem(ItemStack item, int priceReceive) {
		this.item = item;
		amount = item.getAmount();
		price = priceReceive;
	}
	
	public ItemStack getItem() {
		return item;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public int getPrice() {
		return price;
	}
	
	public ItemStack setItem(ItemStack item) {
		this.item = item;
		return this.item;
	}
	
	public int setAmount(int amt) {
		item.setAmount(amt);
		amount = amt;
		return amount;
	}
	
	public int setPrice(int priceReceive) {
		price = priceReceive;
		return price;
	}

}
