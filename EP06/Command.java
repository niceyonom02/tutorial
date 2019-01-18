package newpackage;

import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Command implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, org.bukkit.command.Command command, String s, String[] strings) {
        if(s.equalsIgnoreCase("hi")){
            commandSender.sendMessage("안녕하세요!");
            return true;
        }
        return false;
    }
}
