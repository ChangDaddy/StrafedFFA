package strafed.us.game.games;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import strafed.us.game.Game;

public class FFA extends Game {

    Location spawn = new Location(Bukkit.getWorlds().get(0), 0, 64, 0, 0, 0);

    @Override
    public void join() {
    }

    @Override
    public void leave() {
    }
}
