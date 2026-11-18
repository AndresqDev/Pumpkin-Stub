package pumpkin;

import java.util.List;
import java.util.Map;

/**
 * Java-friendly recipe facade. The nested records mirror the generated Kotlin
 * data classes so the translator can map constructors directly.
 */
public final class Recipe {
    private Recipe() {
    }

    public enum RecipeCategory { BUILDING, REDSTONE, EQUIPMENT, MISC, FOOD, BLOCKS }

    public enum CookingType { SMELTING, BLASTING, SMOKING, CAMPFIRE }

    public interface Ingredient {
    }

    /** Ingredient factories; use these instead of constructing nested variants. */
    public static Ingredient item(String id) {
        return new IngredientValue("item", id, null);
    }

    public static Ingredient tag(String tag) {
        return new IngredientValue("tag", tag, null);
    }

    public static Ingredient oneOf(List<String> ids) {
        return new IngredientValue("oneOf", null, ids);
    }

    public static final class IngredientValue implements Ingredient {
        public final String kind;
        public final String value;
        public final List<String> values;

        IngredientValue(String kind, String value, List<String> values) {
            this.kind = kind;
            this.value = value;
            this.values = values;
        }
    }

    public static class ShapedRecipe {
        public List<String> pattern;
        public Map<String, Ingredient> key;
        public ItemStack output;
        public String group;
        public RecipeCategory category;
        public Boolean showNotification;

        public ShapedRecipe(List<String> pattern, Map<String, Ingredient> key, ItemStack output,
                            String group, RecipeCategory category, Boolean showNotification) {
            this.pattern = pattern;
            this.key = key;
            this.output = output;
            this.group = group;
            this.category = category;
            this.showNotification = showNotification;
        }
    }

    public static class ShapelessRecipe {
        public List<Ingredient> ingredients;
        public ItemStack output;
        public String group;
        public RecipeCategory category;

        public ShapelessRecipe(List<Ingredient> ingredients, ItemStack output,
                               String group, RecipeCategory category) {
            this.ingredients = ingredients;
            this.output = output;
            this.group = group;
            this.category = category;
        }
    }

    public static class CookingRecipe {
        public Ingredient ingredient;
        public ItemStack output;
        public float experience;
        public int cookingTime;
        public String group;
        public RecipeCategory category;

        public CookingRecipe(Ingredient ingredient, ItemStack output, float experience,
                             int cookingTime, String group, RecipeCategory category) {
            this.ingredient = ingredient;
            this.output = output;
            this.experience = experience;
            this.cookingTime = cookingTime;
            this.group = group;
            this.category = category;
        }
    }

    public static class RecipeManager {
        public void registerShaped(String id, ShapedRecipe recipe) {
        }

        public void registerShapeless(String id, ShapelessRecipe recipe) {
        }

        public void registerCooking(String id, CookingType stationType, CookingRecipe recipe) {
        }
    }
}
