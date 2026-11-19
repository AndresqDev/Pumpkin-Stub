package pumpkin;

/** Sound identifiers and categories used by the world sound facade. */
public final class Sounds {
    private Sounds() {
    }

    public enum SoundCategory {
        MASTER,
        MUSIC,
        RECORDS,
        WEATHER,
        BLOCKS,
        HOSTILE,
        NEUTRAL,
        PLAYERS,
        AMBIENT,
        VOICE,
        UI
    }

    public enum Sound {
        ENTITY_ENDER_DRAGON_GROWL,
        ENTITY_ENDER_DRAGON_HURT,
        ENTITY_GENERIC_EXPLODE,
        ENTITY_LIGHTNING_BOLT_THUNDER,
        ENTITY_BLAZE_SHOOT,
        ITEM_FIRECHARGE_USE,
        BLOCK_FIRE_AMBIENT,
        BLOCK_FIRE_EXTINGUISH,
        ENTITY_TNT_PRIMED
    }
}
