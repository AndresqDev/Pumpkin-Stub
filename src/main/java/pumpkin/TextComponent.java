package pumpkin;

import java.util.List;

/** No-op text component builder. */
public class TextComponent {
    protected TextComponent() {
    }

    public static TextComponent text(String plain) {
        return new TextComponent();
    }

    public static TextComponent translate(String key, List<TextComponent> with) {
        return new TextComponent();
    }

    public static TextComponent fromLegacyString(String input) {
        return new TextComponent();
    }

    public TextComponent addChild(TextComponent child) {
        return this;
    }

    public TextComponent addText(String text) {
        return this;
    }

    public TextComponent bold(boolean value) {
        return this;
    }

    public TextComponent italic(boolean value) {
        return this;
    }

    public TextComponent underlined(boolean value) {
        return this;
    }

    public TextComponent color(String color) {
        return this;
    }

    public TextComponent colorNamed(Common.NamedColor color) {
        return this;
    }

    public TextComponent colorRgb(Common.RgbColor color) {
        return this;
    }

    public TextComponent gradientNamed(List<Common.NamedColor> colors) {
        return this;
    }

    public TextComponent gradient(List<Common.RgbColor> colors) {
        return this;
    }

    public TextComponent rainbow() {
        return this;
    }

    public TextComponent strikethrough(boolean value) {
        return this;
    }

    public TextComponent obfuscated(boolean value) {
        return this;
    }

    public TextComponent insertion(String text) {
        return this;
    }

    public TextComponent font(String font) {
        return this;
    }

    public TextComponent shadowColor(Common.ArgbColor color) {
        return this;
    }

    public TextComponent clickRunCommand(String command) {
        return this;
    }

    public TextComponent clickSuggestCommand(String command) {
        return this;
    }

    public TextComponent hoverShowText(TextComponent text) {
        return this;
    }

    public static TextComponent fromJson(String json) {
        return new TextComponent();
    }

    public String getText() {
        return "";
    }

    public String toJson() {
        return "{}";
    }
}
