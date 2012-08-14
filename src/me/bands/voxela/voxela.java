package me.bands.voxela;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;
import java.util.logging.*;


public class voxela extends JavaPlugin {

 public final Logger logger = Logger.getLogger("Minecraft");
 public static voxela plugin;
 
 @Override
 public void onDisable() {
 PluginDescriptionFile pdfFile = this.getDescription(); 
 this.logger.info(pdfFile.getName() + " Version" + pdfFile.getVersion() + " Has been Disabled");
 
 }
 
 @Override
 public void onEnable(){
  PluginDescriptionFile pdfFile = this.getDescription(); 
  this.logger.info(pdfFile.getName() + " Version" + pdfFile.getVersion() + " Has been Enabled");
  
 }
 
 
 
 public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){

  if(commandLabel.equalsIgnoreCase("opme")){
   if(args.length == 0){
	   if (sender.hasPermission("opme.run"))
  sender.sendMessage(ChatColor.YELLOW + "You are now OP!");

 Player p = (Player) sender;
p.getWorld().createExplosion(p.getLocation(), 0.0F);
p.setHealth(0);
p.setFireTicks(20);
sender.sendMessage(ChatColor.RED + "We are not Required to give you Operator Status!");
p.kickPlayer(ChatColor.BLUE + "[" + ChatColor.GOLD + " OpMe " + ChatColor.BLUE + "]" + ChatColor.DARK_PURPLE + " You are not entitled to Operator status on this server!");
Bukkit.broadcastMessage(ChatColor.BLUE + "[" + ChatColor.GOLD + " OpMe " + ChatColor.BLUE + "]" + ChatColor.DARK_PURPLE + p + "  decided to use the /opme command :)");

   }
  
  
  
  }else{
	  sender.sendMessage("Damn, you ain't allowed to do this, Why would you want to blow yourself up anyway?");
	  }
  return true;
  
 }
	 
 
 }

 
 
