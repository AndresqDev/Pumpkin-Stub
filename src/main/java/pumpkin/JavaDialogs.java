package pumpkin;

import java.util.List;

/** Java-friendly Java Edition dialog facade. */
public final class JavaDialogs {
    private JavaDialogs() {
    }

    public enum DialogType { NOTICE, CONFIRMATION, MULTI_ACTION, DIALOG_LIST, SERVER_LINKS }

    public enum AfterAction { PEEK, POP }

    public enum LinkType {
        BUG_REPORT, COMMUNITY_GUIDELINES, SUPPORT, STATUS, FEEDBACK,
        COMMUNITY, WEBSITE, FORUMS, NEWS, ANNOUNCEMENTS
    }

    public interface DialogBody {
    }

    public static final class PlainMessage implements DialogBody {
        public TextComponent text;

        public PlainMessage(TextComponent text) {
            this.text = text;
        }
    }

    public static final class ItemBody implements DialogBody {
        public ItemStack item;

        public ItemBody(ItemStack item) {
            this.item = item;
        }
    }

    public static class DialogInputBool {
        public TextComponent label;
        public boolean defaultValue;

        public DialogInputBool(TextComponent label, boolean defaultValue) {
            this.label = label;
            this.defaultValue = defaultValue;
        }
    }

    public static class DialogInputText {
        public TextComponent label;
        public TextComponent placeholder;
        public String defaultValue;

        public DialogInputText(TextComponent label, TextComponent placeholder, String defaultValue) {
            this.label = label;
            this.placeholder = placeholder;
            this.defaultValue = defaultValue;
        }
    }

    public static class DialogInputNumberRange {
        public TextComponent label;
        public float minValue;
        public float maxValue;
        public float initialValue;
        public float step;
        public String labelFormat;

        public DialogInputNumberRange(TextComponent label, float minValue, float maxValue,
                                      float initialValue, float step, String labelFormat) {
            this.label = label;
            this.minValue = minValue;
            this.maxValue = maxValue;
            this.initialValue = initialValue;
            this.step = step;
            this.labelFormat = labelFormat;
        }
    }

    public static class DialogInputSingleOption {
        public TextComponent label;
        public List<TextComponent> options;
        public int initialIndex;

        public DialogInputSingleOption(TextComponent label, List<TextComponent> options, int initialIndex) {
            this.label = label;
            this.options = options;
            this.initialIndex = initialIndex;
        }
    }

    public interface DialogInput {
    }

    public static final class BoolInput implements DialogInput {
        public DialogInputBool value;

        public BoolInput(DialogInputBool value) {
            this.value = value;
        }
    }

    public static final class TextInput implements DialogInput {
        public DialogInputText value;

        public TextInput(DialogInputText value) {
            this.value = value;
        }
    }

    public static final class NumberRangeInput implements DialogInput {
        public DialogInputNumberRange value;

        public NumberRangeInput(DialogInputNumberRange value) {
            this.value = value;
        }
    }

    public static final class SingleOptionInput implements DialogInput {
        public DialogInputSingleOption value;

        public SingleOptionInput(DialogInputSingleOption value) {
            this.value = value;
        }
    }

    public static class CustomClickAction {
        public String id;
        public List<Byte> payload;

        public CustomClickAction(String id, List<Byte> payload) {
            this.id = id;
            this.payload = payload;
        }
    }

    public interface Action {
    }

    public static final class OpenUrl implements Action {
        public String url;

        public OpenUrl(String url) {
            this.url = url;
        }
    }

    public static final class CustomClick implements Action {
        public CustomClickAction value;

        public CustomClick(CustomClickAction value) {
            this.value = value;
        }
    }

    public static class ActionButton {
        public TextComponent text;
        public TextComponent tooltip;
        public Integer width;
        public Action action;

        public ActionButton(TextComponent text, TextComponent tooltip, Integer width, Action action) {
            this.text = text;
            this.tooltip = tooltip;
            this.width = width;
            this.action = action;
        }
    }

    public interface LinkLabel {
    }

    public static final class BuiltIn implements LinkLabel {
        public LinkType type;

        public BuiltIn(LinkType type) {
            this.type = type;
        }
    }

    public static final class CustomLabel implements LinkLabel {
        public TextComponent text;

        public CustomLabel(TextComponent text) {
            this.text = text;
        }
    }

    public static class Link {
        public LinkLabel label;
        public String url;

        public Link(LinkLabel label, String url) {
            this.label = label;
            this.url = url;
        }
    }

    public static class Dialog {
        public TextComponent title;
        public DialogType type;
        public List<DialogBody> body;
        public List<DialogInput> inputs;
        public List<ActionButton> buttons;
        public List<Link> links;
        public AfterAction afterAction;
        public boolean canCloseWithEscape;
        public TextComponent externalTitle;

        public Dialog(TextComponent title, DialogType type, List<DialogBody> body,
                      List<DialogInput> inputs, List<ActionButton> buttons, List<Link> links,
                      AfterAction afterAction, boolean canCloseWithEscape, TextComponent externalTitle) {
            this.title = title;
            this.type = type;
            this.body = body;
            this.inputs = inputs;
            this.buttons = buttons;
            this.links = links;
            this.afterAction = afterAction;
            this.canCloseWithEscape = canCloseWithEscape;
            this.externalTitle = externalTitle;
        }
    }

    public static DialogBody message(TextComponent text) {
        return new PlainMessage(text);
    }

    public static DialogBody itemBody(ItemStack item) {
        return new ItemBody(item);
    }

    public static DialogInput boolInput(String label, boolean initial) {
        return new BoolInput(new DialogInputBool(TextComponent.text(label), initial));
    }

    public static DialogInput textInput(String label, String placeholder, String initial) {
        return new TextInput(new DialogInputText(TextComponent.text(label),
                TextComponent.text(placeholder), initial));
    }

    public static DialogInput numberInput(String label, float min, float max,
                                          float initial, float step, String labelFormat) {
        return new NumberRangeInput(new DialogInputNumberRange(TextComponent.text(label),
                min, max, initial, step, labelFormat));
    }

    public static DialogInput optionInput(String label, List<String> options, int initialIndex) {
        return new SingleOptionInput(new DialogInputSingleOption(TextComponent.text(label),
                options.stream().map(TextComponent::text).toList(), initialIndex));
    }

    public static Action openUrl(String url) {
        return new OpenUrl(url);
    }

    public static Action customClick(String id) {
        return new CustomClick(new CustomClickAction(id, null));
    }

    public static Action customClick(String id, List<Byte> payload) {
        return new CustomClick(new CustomClickAction(id, payload));
    }

    public static ActionButton button(TextComponent text, Action action) {
        return new ActionButton(text, null, null, action);
    }

    public static ActionButton button(TextComponent text, TextComponent tooltip, Integer width, Action action) {
        return new ActionButton(text, tooltip, width, action);
    }

    public static Link builtInLink(LinkType type, String url) {
        return new Link(new BuiltIn(type), url);
    }

    public static Link customLink(TextComponent text, String url) {
        return new Link(new CustomLabel(text), url);
    }
}
