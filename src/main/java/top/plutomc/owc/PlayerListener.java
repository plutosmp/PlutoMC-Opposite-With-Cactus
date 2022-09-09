package top.plutomc.owc;

import org.bukkit.Material;
import org.bukkit.block.data.Directional;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public final class PlayerListener implements Listener {
    @EventHandler
    public void blockPlaceEvent(BlockPlaceEvent event) {
        Player player = event.getPlayer();

        Material leftHand = player.getInventory().getItemInOffHand().getType();

        if (event.getBlock().getBlockData() instanceof Directional directional) {
            if (leftHand == Material.CACTUS) {
                if (FacingUtil.getOppositeFacing(directional.getFacing()) != null) {
                    try {
                        directional.setFacing(FacingUtil.getOppositeFacing(directional.getFacing()));
                        event.getBlock().setBlockData(directional);
                    }catch (Exception ignored) {
                    }
                }
            }
        }
    }
}
