package pumpkin;

/** Entity type identifiers used by world spawning. */
public final class EntityTypes {
    private EntityTypes() {
    }

    public enum EntityType {
        BLOCK_DISPLAY,
        ITEM_DISPLAY,
        TEXT_DISPLAY,
        ZOMBIE,
        SKELETON,
        COW,
        PIG,
        SHEEP,
        ARMOR_STAND,
    }
}
