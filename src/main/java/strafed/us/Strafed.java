package strafed.us;

import org.bukkit.plugin.java.JavaPlugin;
import strafed.us.data.DataManager;

public class Strafed extends JavaPlugin {

    private DataManager dataManager;

    @Override
    public void onEnable() {
        dataManager = new DataManager(this);
        super.onEnable();
    }

    @Override
    public void onDisable() {

        super.onDisable();
    }
}
