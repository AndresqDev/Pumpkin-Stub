package pumpkin;

import java.util.List;

/** Java-friendly datapack manager facade. */
public final class Datapack {
    private Datapack() {
    }

    public static class DatapackInfo {
        public String id;
        public String name;
        public String description;
        public int packFormat;
        public boolean isEnabled;
        public int recipeCount;
        public int functionCount;

        public DatapackInfo(String id, String name, String description, int packFormat,
                            boolean isEnabled, int recipeCount, int functionCount) {
            this.id = id;
            this.name = name;
            this.description = description;
            this.packFormat = packFormat;
            this.isEnabled = isEnabled;
            this.recipeCount = recipeCount;
            this.functionCount = functionCount;
        }
    }

    public interface EnablePosition {
    }

    public static EnablePosition first() {
        return new EnablePositionValue("first", null);
    }

    public static EnablePosition last() {
        return new EnablePositionValue("last", null);
    }

    public static EnablePosition before(String name) {
        return new EnablePositionValue("before", name);
    }

    public static EnablePosition after(String name) {
        return new EnablePositionValue("after", name);
    }

    public static final class EnablePositionValue implements EnablePosition {
        public final String kind;
        public final String name;

        EnablePositionValue(String kind, String name) {
            this.kind = kind;
            this.name = name;
        }
    }

    public static class DatapackManager {
        public List<DatapackInfo> listAllPacks() {
            return List.of();
        }

        public List<DatapackInfo> listEnabledPacks() {
            return List.of();
        }

        public List<DatapackInfo> listAvailablePacks() {
            return List.of();
        }

        public DatapackInfo getPack(String name) {
            return null;
        }

        public boolean isEnabled(String name) {
            return false;
        }

        public void enablePack(String name, EnablePosition position) {
        }

        public void disablePack(String name) {
        }

        public void reload() {
        }

        public int executeFunction(String name) {
            return 0;
        }
    }
}
