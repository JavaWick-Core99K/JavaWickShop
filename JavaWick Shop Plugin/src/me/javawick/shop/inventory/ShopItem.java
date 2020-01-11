package me.javawick.shop.inventory;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import me.javawick.util.chat.Color;

public class ShopItem {

	private ItemStack item;
	private ItemStack displayItem;
	private String displayName;
	private int amount;
	private int price;
	private boolean forSale;
	private boolean navigator;
	private Shop navigate;
	
	public ShopItem(ItemStack i, int cost, boolean canSell, boolean navigator) {
		item = i;
		displayName = i.getItemMeta().getDisplayName();
		amount = i.getAmount();
		price = cost;
		forSale = canSell;
		this.navigator = navigator;
		navigate = null;
		
		ItemStack copy = i.clone();
		
		if(forSale) {
			ItemMeta meta = copy.getItemMeta();
			List<String> lore = new ArrayList<String>();
			
			if(meta.hasLore()) {
				lore = meta.getLore();
				
			}
			
			lore.add(Color.chat("&a&lPrice: &a$" + cost));
			meta.setLore(lore);
			copy.setItemMeta(meta);
		}
		
		displayItem = copy;
	}
	
	public ItemStack getItem() {
		return item;
	}
	
	public ItemStack getDisplayItem() {
		return displayItem;
	}
	
	public String getDisplayName() {
		return displayName;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public int getPrice() {
		return price;
	}
	
	public Shop getNavigate() {
		return navigate;
	}
	
	public boolean isForSale() {
		return forSale;
	}
	
	public boolean isNavigator() {
		return navigator;
	}
	
	public void setNavigate(Shop shop) {
		navigate = shop;
	}
}
