package me.javawick.shop.events;

import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.InventoryView;
import org.bukkit.inventory.ItemStack;

import me.javawick.shop.Main;
import me.javawick.shop.inventory.Shop;
import me.javawick.shop.inventory.ShopItem;
import me.javawick.util.chat.Color;

public class ItemClick implements Listener {

	private Main plugin;

	public ItemClick(Main pl) {
		plugin = pl;
	}

	@EventHandler
	public void onClick(InventoryClickEvent e) {

		ItemStack clickedItem = e.getCurrentItem();
		HumanEntity ent = e.getWhoClicked();
		InventoryView inv = ent.getOpenInventory();
		int slot = e.getSlot();

		// is clicked item air or null? cancel if so
		if (clickedItem == null)
			return;

		// is the entity a player?
		if (!(ent instanceof Player))
			return;

		Player p = (Player) ent;

		// find match to shop title
		for (int i = 0; i < plugin.getShops().size(); i++) {

			Shop shop = plugin.getShop(i);

			if (inv.getTitle().equals(shop.getTitle())) {

				e.setCancelled(true);
				transaction(clickedItem, slot, p, shop);
				return;
			}
		}
	}

	private void transaction(ItemStack i, int slot, Player p, Shop s) {

		int cost;
		int balance = plugin.getPlayerBalance(p);
		ShopItem item = s.getShopItem(slot);

		try {

			// check if clicked item is a shop item
			if (i.equals(item.getDisplayItem())) {

				// is the item a navigator?
				if (item.isNavigator()) {
					p.openInventory(item.getNavigate().getInventory());
				}

				// is the shop a tradeable shop?
				else if (s.canTrade()) {

					if (p.getInventory().containsAtLeast(item.getItem(), item.getAmount())) {

						// successful transaction
						p.getInventory().removeItem(item.getItem());

						plugin.setPlayerBalance(p, item.getPrice(), true);

						p.sendMessage(
								Color.chat("&aItem sold! $" + item.getPrice() + " has been added to your account"));

					} else {
						p.sendMessage(Color.chat("&cYou don't have enough of that item"));
					}
				}
				
				// is the item for sale?
				else if (item.isForSale()) {
					cost = item.getPrice();

					// is player balance less than the cost?
					if (balance < cost) {
						p.sendMessage(Color.chat("&cYou don't have enough money to buy this"));
						return;
					}

					// successful transaction
					plugin.setPlayerBalance(p, cost, false);

					p.getWorld().dropItem(p.getLocation(), item.getItem());
					p.sendMessage(Color.chat("&aItem bought!"));
				}
				
				return;
			}

		} catch (NullPointerException nil) {
			// do nothing
			return;
		}

	}

}
