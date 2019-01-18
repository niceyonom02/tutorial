package newpackage;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    public static Main instance;
    @Override
    public void onEnable(){
        instance = this;
        instance.getLogger().info("[알림] 테스트 플러그인이 시작되었습니다.");

        getCommand("hi").setExecutor(new Command());
        Bukkit.getPluginManager().registerEvents(new OnBlockPlace(), this);
    }

    @Override
    public void onDisable(){
        instance.getLogger().info("[알림] 테스트 플러그인이 종료되었습니다.");
    }
}
