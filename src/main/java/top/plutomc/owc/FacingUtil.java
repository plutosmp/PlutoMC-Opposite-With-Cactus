package top.plutomc.owc;

import org.bukkit.block.BlockFace;

public final class FacingUtil {
    private FacingUtil() {

    }

    public static BlockFace getOppositeFacing(BlockFace blockFace) {
        switch (blockFace) {
            case UP -> { return BlockFace.DOWN; }
            case DOWN -> { return BlockFace.UP; }
            case EAST -> { return BlockFace.WEST; }
            case WEST -> { return BlockFace.EAST; }
            case NORTH -> { return BlockFace.SOUTH; }
            case SOUTH ->  { return BlockFace.NORTH; }
            default -> { return null; }
        }
    }
}
