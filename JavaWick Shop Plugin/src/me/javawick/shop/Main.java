package me.javawick.shop;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import me.javawick.bank.BankMain;
import me.javawick.bank.util.Bank;
import me.javawick.shop.commands.OpenShop;
import me.javawick.shop.events.ItemClick;
import me.javawick.shop.inventory.Shop;
import me.javawick.shop.shops.BlockShop;
import me.javawick.shop.shops.FoodShop;
import me.javawick.shop.shops.MainShop;
import me.javawick.shop.shops.MaterialShop;
import me.javawick.shop.shops.RedstoneShop;
import me.javawick.shop.shops.ToolShop;
import me.javawick.shop.shops.TradeShop;
import me.javawick.shop.shops.TransportationShop;
import me.javawick.shop.shops.WeaponShop;

public class Main extends JavaPlugin {

	// Bank Plugin
	private BankMain bank;
	
	// Shops
	private List<Shop> shops;
	
	@Override
	public void onEnable() {
		bank = Bank.getBank();
		
		// CREATE SHOPS
		shops = new ArrayList<Shop>();
		
		shops.add(new MainShop());
		shops.add(new FoodShop().setNavigate(shops.get(0), 53));
		shops.add(new WeaponShop().setNavigate(shops.get(0), 53));
		shops.add(new MaterialShop().setNavigate(shops.get(0), 53));
		shops.add(new RedstoneShop().setNavigate(shops.get(0), 53));
		shops.add(new TradeShop().setNavigate(shops.get(0), 53));
		shops.add(new ToolShop().setNavigate(shops.get(0), 53));
		shops.add(new BlockShop().setNavigate(shops.get(0), 53));
		shops.add(new TransportationShop().setNavigate(shops.get(0), 53));
		
		setupCmds();
		setupEvents();
	}
	
	@Override
	public void onDisable() {
		
	}
	
	public BankMain getBank() {
		return bank;
	}
	
	public List<Shop> getShops() {
		return shops;
	}
	
	public Shop getShop(int index) {
		return shops.get(index);
	}
	
	public int getPlayerBalance(Player p) {
		int balance = bank.getAccountsConfig().getConfig().getInt("players." + p.getDisplayName());
		return balance;
	}
	
	public void setPlayerBalance(Player p, int amt, boolean add) {
		int balance = bank.getAccountsConfig().getConfig().getInt("players." + p.getDisplayName());
		
		if(add) {
			balance += amt;
		} else {
			balance -= amt;
		}
		
		bank.getAccountsConfig().getConfig().set("players." + p.getDisplayName(), balance);
		bank.getAccountsConfig().save(this);
		bank.getAccountsConfig().reload(this);
	}
	
	public void setupCmds() {
		new OpenShop(this);
	}
	
	public void setupEvents() {
		PluginManager pm = getServer().getPluginManager();
		
		pm.registerEvents(new ItemClick(this), this);
	}
}
