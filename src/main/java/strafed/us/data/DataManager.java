package strafed.us.data;

import lombok.Getter;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

@Getter
public class DataManager implements Listener {

    public DataManager(JavaPlugin plugin) {
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    private final ConcurrentHashMap<UUID, StrafedPlayer> dataMap = new ConcurrentHashMap<>();

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        addPlayer(player);
    }

    @EventHandler
    public void onLeave(PlayerQuitEvent event) {
        removePlayer(event.getPlayer());
    }

    public void addPlayer(final Player player) {
        if (player != null) {
            dataMap.put(player.getUniqueId(), new StrafedPlayer(player));
        }
    }

    public void removePlayer(final Player player) {
        if (player != null) {
            dataMap.remove(player.getUniqueId());
        }
    }

    public StrafedPlayer get(final Player player) {
        if (player != null) {
            return dataMap.get(player.getUniqueId());
        }
        return null;
    }

}
