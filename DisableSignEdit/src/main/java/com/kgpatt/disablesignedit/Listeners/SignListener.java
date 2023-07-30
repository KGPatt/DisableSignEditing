package com.kgpatt.disablesignedit.Listeners;

import org.bukkit.Tag;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class SignListener implements Listener {
    @EventHandler
    public void onRightClickOnSign(PlayerInteractEvent e) {
        if ((e.getPlayer().hasPermission("signedit.permission"))) return;
        if (!(e.getAction() == Action.RIGHT_CLICK_BLOCK)) return;
        if (!(Tag.ALL_SIGNS.isTagged(e.getClickedBlock().getType()))) return;

        e.setCancelled(true);
    }
}
