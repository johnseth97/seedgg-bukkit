package com.johnseth97.seedgg;

import com.johnseth97.seedgg.command.SeedggCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class SeedggPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        var cmd = new SeedggCommand();
        getCommand("seedgg").setExecutor(cmd);
    }
}
