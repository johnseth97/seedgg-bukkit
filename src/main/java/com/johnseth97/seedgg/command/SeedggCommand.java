package com.johnseth97.seedgg.command;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.event.ClickEvent;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class SeedggCommand implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command,
                             @NotNull String label, @NotNull String[] args) {
        if (!(sender instanceof Player player)) {
            sender.sendMessage("This command can only be run by a player.");
            return true;
        }

        long seed = player.getWorld().getSeed();
        String version = Bukkit.getMinecraftVersion().replace('.', '-');
        String url = "https://www.seeds.gg/" + version + "-java/" + seed;

        player.sendMessage(Component.text()
                .append(Component.text("[SeedGG] ", NamedTextColor.GREEN))
                .append(Component.text("Your seed: ", NamedTextColor.GRAY))
                .append(Component.text(String.valueOf(seed), NamedTextColor.WHITE))
                .append(Component.text("  ", NamedTextColor.GRAY))
                .append(Component.text("[Open on seeds.gg]", NamedTextColor.AQUA)
                        .clickEvent(ClickEvent.openUrl(url)))
                .build());

        return true;
    }
}
