package pumpkin;

/** Java-friendly display entity facade. */
public final class Display {
    private Display() {
    }

    public enum BillboardMode { FIXED, VERTICAL, HORIZONTAL, CENTER }

    public enum ItemDisplayMode {
        NONE, THIRDPERSON_LEFTHAND, THIRDPERSON_RIGHTHAND,
        FIRSTPERSON_LEFTHAND, FIRSTPERSON_RIGHTHAND, HEAD, GUI, GROUND, FIXED
    }

    public enum TextAlignment { CENTER, LEFT, RIGHT }

    public static class Vector3f {
        public float x, y, z;

        public Vector3f(float x, float y, float z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }
    }

    public static class Quaternionf {
        public float x, y, z, w;

        public Quaternionf(float x, float y, float z, float w) {
            this.x = x;
            this.y = y;
            this.z = z;
            this.w = w;
        }
    }

    public static class DisplayTransformation {
        public Vector3f translation;
        public Vector3f scale;
        public Quaternionf leftRotation;
        public Quaternionf rightRotation;

        public DisplayTransformation(Vector3f translation, Vector3f scale,
                                     Quaternionf leftRotation, Quaternionf rightRotation) {
            this.translation = translation;
            this.scale = scale;
            this.leftRotation = leftRotation;
            this.rightRotation = rightRotation;
        }
    }

    public static class DisplayEntity {
        private final World.Entity entity;

        public DisplayEntity(World.Entity entity) {
            this.entity = entity;
        }

        public World.Entity getEntity() {
            return entity;
        }

        public DisplayEntity getDisplay() {
            return this;
        }

        public DisplayTransformation getTransformation() {
            return new DisplayTransformation(new Vector3f(0, 0, 0), new Vector3f(1, 1, 1),
                    new Quaternionf(0, 0, 0, 1), new Quaternionf(0, 0, 0, 1));
        }

        public void setTransformation(DisplayTransformation transformation) {
        }

        public int getInterpolationDuration() {
            return 0;
        }

        public void setInterpolationDuration(int duration) {
        }

        public int getInterpolationStart() {
            return 0;
        }

        public void setInterpolationStart(int deltaTicks) {
        }

        public int getTeleportDuration() {
            return 0;
        }

        public void setTeleportDuration(int duration) {
        }

        public BillboardMode getBillboard() {
            return BillboardMode.FIXED;
        }

        public void setBillboard(BillboardMode mode) {
        }

        public float getViewRange() {
            return 1.0f;
        }

        public void setViewRange(float range) {
        }

        public float getShadowRadius() {
            return 0.0f;
        }

        public void setShadowRadius(float radius) {
        }

        public float getShadowStrength() {
            return 1.0f;
        }

        public void setShadowStrength(float strength) {
        }

        public float getDisplayWidth() {
            return 0.0f;
        }

        public void setDisplayWidth(float width) {
        }

        public float getDisplayHeight() {
            return 0.0f;
        }

        public void setDisplayHeight(float height) {
        }

        public int getGlowColorOverride() {
            return 0;
        }

        public void setGlowColorOverride(int color) {
        }

        public int getBrightness() {
            return 0;
        }

        public void setBrightness(int brightness) {
        }
    }

    public static class BlockDisplayEntity extends DisplayEntity {
        public BlockDisplayEntity(World.Entity entity) {
            super(entity);
        }

        public static BlockDisplayEntity fromEntity(World.Entity entity) {
            return null;
        }

        public int getBlockStateId() {
            return 0;
        }

        public void setBlockStateId(int stateId) {
        }
    }

    public static class ItemDisplayEntity extends DisplayEntity {
        public ItemDisplayEntity(World.Entity entity) {
            super(entity);
        }

        public static ItemDisplayEntity fromEntity(World.Entity entity) {
            return null;
        }

        public ItemStack getItem() {
            return null;
        }

        public void setItem(ItemStack item) {
        }

        public ItemDisplayMode getItemDisplayMode() {
            return ItemDisplayMode.NONE;
        }

        public void setItemDisplayMode(ItemDisplayMode mode) {
        }
    }

    public static class TextDisplayEntity extends DisplayEntity {
        public TextDisplayEntity(World.Entity entity) {
            super(entity);
        }

        public static TextDisplayEntity fromEntity(World.Entity entity) {
            return null;
        }

        public TextComponent getText() {
            return TextComponent.text("");
        }

        public void setText(TextComponent text) {
        }

        public int getLineWidth() {
            return 200;
        }

        public void setLineWidth(int width) {
        }

        public int getBackground() {
            return 0;
        }

        public void setBackground(int color) {
        }

        public byte getTextOpacity() {
            return -1;
        }

        public void setTextOpacity(byte opacity) {
        }

        public boolean getShadow() {
            return false;
        }

        public void setShadow(boolean shadow) {
        }

        public boolean getSeeThrough() {
            return false;
        }

        public void setSeeThrough(boolean seeThrough) {
        }

        public boolean getDefaultBackground() {
            return true;
        }

        public void setDefaultBackground(boolean defaultBackground) {
        }

        public TextAlignment getAlignment() {
            return TextAlignment.CENTER;
        }

        public void setAlignment(TextAlignment alignment) {
        }
    }
}
