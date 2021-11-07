package strafed.us.data;

import lombok.Getter;
import org.bukkit.entity.Player;

import java.util.UUID;


@Getter
public class StrafedPlayer {
    private final Player player;
    private final UUID uuid;

    public StrafedPlayer(final Player player) {
        this.uuid = player.getUniqueId();
        this.player = player;
    }
}
