package pl.za.xvacuum.qessentials.commands;

import java.util.Arrays;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import pl.za.xvacuum.qessentials.utils.HelpUtil;
import pl.za.xvacuum.qessentials.utils.Util;
import pl.za.xvacuum.qessentials.utils.QCommand;

public class Help extends QCommand{

	public Help() {
		super("help", "Pomoc", "/help", "help", Arrays.asList(new String[] { "qhelp", "qcommands", "commands", "pomoc", "qpomoc"}));
	}

	@Override
	public void onExecute(CommandSender sender, String[] args) 
	{
		Player p = (Player)sender;
		if(args.length == 0){
			HelpUtil.sendHelp(1, p);
		}else if (args.length == 1)
		{
			if(Util.isInteger(args[0])){
				if(args[0].equalsIgnoreCase("1"))
				{
					HelpUtil.sendHelp(1, p);
					return;
				}
				if(args[0].equalsIgnoreCase("2"))
				{
					HelpUtil.sendHelp(2, p);
					return;
				}
				if(args[0].equalsIgnoreCase("3"))
				{
					HelpUtil.sendHelp(3, p);
					return;
				}
				if(args[0].equalsIgnoreCase("4"))
				{
					HelpUtil.sendHelp(4, p);
					return;
				}
				else if ((!args[0].equalsIgnoreCase("1")) || (!args[0].equalsIgnoreCase("2") || (!args[0].equalsIgnoreCase("3"))))
				{
					Util.sendMessage(p, "&cNie znaleziono strony o numerze &7" + args[0].toString() + "&c!");
					return;
				}
			}else{
				Util.sendMessage(p, "&cStrona musi byc liczba!");
			}
		}
		
	}
	
	

}
