package newpackage;

import org.apache.logging.log4j.core.net.Priority;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class OnBlockPlace implements Listener {
    @EventHandler(priority = EventPriority.LOWEST)
    public void onBlockPlace(BlockPlaceEvent event){
        if(!event.getPlayer().isOp()){
            event.getPlayer().sendMessage("OP가 없기 때문에 블럭을 설치할 수 없습니다!");
            event.setCancelled(true);
        }
    }
}
