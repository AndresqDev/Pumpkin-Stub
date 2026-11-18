package pumpkin;

import java.util.List;

/** Java-friendly custom enchantment facade. */
public final class Enchantments {
    private Enchantments() {
    }

    public enum AttributeModifierSlot {
        ANY, MAIN_HAND, OFF_HAND, HAND, FEET, LEGS, CHEST, HEAD, ARMOR, BODY, SADDLE
    }

    public enum Enchantment {
        AQUA_AFFINITY, BANE_OF_ARTHROPODS, BINDING_CURSE, BLAST_PROTECTION, BREACH,
        CHANNELING, DENSITY, DEPTH_STRIDER, EFFICIENCY, FEATHER_FALLING, FIRE_ASPECT,
        FIRE_PROTECTION, FLAME, FORTUNE, FROST_WALKER, IMPALING, INFINITY, KNOCKBACK,
        LOOTING, LOYALTY, LUCK_OF_THE_SEA, LUNGE, LURE, MENDING, MULTISHOT, PIERCING,
        POWER, PROJECTILE_PROTECTION, PROTECTION, PUNCH, QUICK_CHARGE, RESPIRATION,
        RIPTIDE, SHARPNESS, SILK_TOUCH, SMITE, SOUL_SPEED, SWEEPING_EDGE, SWIFT_SNEAK,
        THORNS, UNBREAKING, VANISHING_CURSE, WIND_BURST
    }

    public static class CustomEnchantment {
        public String id;
        public TextComponent description;
        public int maxLevel;
        public int anvilCost;
        public String supportedItems;
        public int weight;
        public List<AttributeModifierSlot> slots;
        public List<String> exclusiveSet;

        public CustomEnchantment(String id, TextComponent description, int maxLevel, int anvilCost,
                                 String supportedItems, int weight,
                                 List<AttributeModifierSlot> slots, List<String> exclusiveSet) {
            this.id = id;
            this.description = description;
            this.maxLevel = maxLevel;
            this.anvilCost = anvilCost;
            this.supportedItems = supportedItems;
            this.weight = weight;
            this.slots = slots;
            this.exclusiveSet = exclusiveSet;
        }
    }

    public static class EnchantmentManager {
        public void registerEnchantment(CustomEnchantment enchantment) {
        }
    }
}
