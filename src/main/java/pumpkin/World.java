package pumpkin;

import java.util.List;

/** No-op world facade. */
public class World {
    public static class Block {
        public int id;
        public String name;
        public float hardness;
        public float blastResistance;
        public int mapColor;
        public float slipperiness;
        public float velocityMultiplier;
        public float jumpVelocityMultiplier;
        public int itemId;
        public int defaultStateId;
        public java.util.List<Integer> stateIds = List.of();
        public boolean isSolid;
        public boolean isAir;
        public boolean isFlammable;
    }

    public static class BlockState {
        public int id;
        public int blockId;
        public String blockName;
        public int luminance;
        public int opacity;
        public float hardness;
        public boolean isAir;
        public boolean isLiquid;
    }

    public static class Entity {
        public Mob asMob() {
            return null;
        }

        public void teleport(Position position, World world) {
        }

        public void remove() {
        }
    }

    public static class LivingEntity {
        public float getHealth() {
            return 20.0f;
        }

        public void setHealth(float health) {
        }

        public float getMaxHealth() {
            return 20.0f;
        }

        public void setMaxHealth(float maxHealth) {
        }
    }

    public static class Mob {
        public Entity asEntity() {
            return new Entity();
        }

        public LivingEntity asLiving() {
            return new LivingEntity();
        }

        public float getHealth() {
            return 20.0f;
        }

        public void setHealth(float health) {
        }

        public float getMaxHealth() {
            return 20.0f;
        }

        public void setMaxHealth(float maxHealth) {
        }

        public void addCustomAiGoal(int priority, int goalId) {
        }

        public boolean navigateToPos(Position position, double speed) {
            return false;
        }

        public boolean navigateToEntity(Entity target, double speed) {
            return false;
        }

        public Entity getTarget() {
            return null;
        }

        public void setTarget(Entity target) {
        }
    }

    public String getName() {
        return "";
    }

    public List<Player> getPlayers() {
        return List.of();
    }

    public Player getPlayer(String name) {
        return null;
    }

    public void setTime(long time) {
    }

    public long getTime() {
        return 0L;
    }

    public void setStorm(boolean storm) {
    }

    public void setThundering(boolean thundering) {
    }

    public void playSound(Position position, String sound) {
    }

    public Scoreboard getScoreboard() {
        return new Scoreboard();
    }

    public Block getBlockByName(String name) {
        return null;
    }

    public Block getBlockById(int id) {
        return null;
    }

    public List<Block> getAllBlocks() {
        return List.of();
    }

    public List<BlockState> getStatesForBlock(Block block) {
        return List.of();
    }

    public List<BlockState> getStatesForBlockId(int blockId) {
        return List.of();
    }

    public Entity spawnEntity(EntityTypes.EntityType type, Position position) {
        return new Entity();
    }

    public int getBlockStateId(BlockPos position) {
        return 0;
    }

    public void setBlockStateId(BlockPos position, int stateId) {
    }

    public void setBlockByName(BlockPos position, String block) {
    }

    public void spawnParticle(Particles.Particle particle, Position position,
                              Position offset, int count, double speed) {
    }

    public void playSound(Sounds.Sound sound, Sounds.SoundCategory category,
                          Position position, float volume, float pitch) {
    }

    public void playCustomSound(String sound, Sounds.SoundCategory category,
                                Position position, float volume, float pitch) {
    }

    public void createExplosion(Position position, float power, boolean createFire) {
    }
}
