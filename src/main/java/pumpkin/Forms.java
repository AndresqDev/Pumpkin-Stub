package pumpkin;

import java.util.List;

/**
 * Java-friendly Bedrock forms facade.
 *
 * <p>Use {@link Form#simple}, {@link Form#modal} and {@link Form#custom} to
 * create the sealed value that {@link BedrockPlayer#openForm} expects. The
 * translator maps those factories to the generated Kotlin sealed variants.</p>
 */
public final class Forms {
    private Forms() {
    }

    public enum ImageType { URL, PATH }

    public static class FormImage {
        public ImageType type;
        public String data;

        public FormImage(ImageType type, String data) {
            this.type = type;
            this.data = data;
        }
    }

    public static class SimpleFormButton {
        public TextComponent text;
        public FormImage image;

        public SimpleFormButton(TextComponent text) {
            this(text, null);
        }

        public SimpleFormButton(TextComponent text, FormImage image) {
            this.text = text;
            this.image = image;
        }
    }

    public static class SimpleForm {
        public TextComponent title;
        public TextComponent content;
        public List<SimpleFormButton> buttons;

        public SimpleForm(TextComponent title, TextComponent content, List<SimpleFormButton> buttons) {
            this.title = title;
            this.content = content;
            this.buttons = buttons;
        }
    }

    public static class ModalForm {
        public TextComponent title;
        public TextComponent content;
        public TextComponent button1;
        public TextComponent button2;

        public ModalForm(TextComponent title, TextComponent content,
                         TextComponent button1, TextComponent button2) {
            this.title = title;
            this.content = content;
            this.button1 = button1;
            this.button2 = button2;
        }
    }

    public interface CustomFormElement {
    }

    /** A custom form element; use the static factories in {@link Forms} to build one. */
    public static final class Element implements CustomFormElement {
        public final Object value;

        private Element(Object value) {
            this.value = value;
        }
    }

    public static class CustomForm {
        public TextComponent title;
        public List<CustomFormElement> elements;

        public CustomForm(TextComponent title, List<CustomFormElement> elements) {
            this.title = title;
            this.elements = elements;
        }
    }

    /** Sealed form value; use the static factory methods. */
    public interface Form {
        static Form simple(SimpleForm form) {
            return () -> form;
        }

        static Form modal(ModalForm form) {
            return () -> form;
        }

        static Form custom(CustomForm form) {
            return () -> form;
        }

        Object value();
    }

    public static SimpleFormButton button(String text) {
        return new SimpleFormButton(TextComponent.text(text));
    }

    public static SimpleFormButton button(String text, FormImage image) {
        return new SimpleFormButton(TextComponent.text(text), image);
    }

    public static FormImage image(ImageType type, String data) {
        return new FormImage(type, data);
    }

    public static CustomFormElement label(String text) {
        return new Element(TextComponent.text(text));
    }

    public static CustomFormElement toggle(String text, boolean initial) {
        return new Element(new ToggleValue(TextComponent.text(text), initial));
    }

    public static CustomFormElement input(String text, String placeholder, String initial) {
        return new Element(new InputValue(TextComponent.text(text), placeholder, initial));
    }

    public static CustomFormElement dropdown(String text, List<String> options, int initialIndex) {
        return new Element(new DropdownValue(TextComponent.text(text), options, initialIndex));
    }

    public static CustomFormElement slider(String text, float min, float max, float initial, float step) {
        return new Element(new SliderValue(TextComponent.text(text), min, max, initial, step));
    }

    public static CustomFormElement stepSlider(String text, List<String> options, int initialIndex) {
        return new Element(new StepSliderValue(TextComponent.text(text), options, initialIndex));
    }

    /** Internal value holders used by the translator to rebuild Kotlin pairs/triples. */
    public static final class ToggleValue {
        public final TextComponent text;
        public final boolean value;

        public ToggleValue(TextComponent text, boolean value) {
            this.text = text;
            this.value = value;
        }
    }

    public static final class InputValue {
        public final TextComponent text;
        public final String placeholder;
        public final String initial;

        public InputValue(TextComponent text, String placeholder, String initial) {
            this.text = text;
            this.placeholder = placeholder;
            this.initial = initial;
        }
    }

    public static final class DropdownValue {
        public final TextComponent text;
        public final List<String> options;
        public final int initialIndex;

        public DropdownValue(TextComponent text, List<String> options, int initialIndex) {
            this.text = text;
            this.options = options;
            this.initialIndex = initialIndex;
        }
    }

    public static final class SliderValue {
        public final TextComponent text;
        public final float min;
        public final float max;
        public final float initial;
        public final float step;

        public SliderValue(TextComponent text, float min, float max, float initial, float step) {
            this.text = text;
            this.min = min;
            this.max = max;
            this.initial = initial;
            this.step = step;
        }
    }

    public static final class StepSliderValue {
        public final TextComponent text;
        public final List<String> options;
        public final int initialIndex;

        public StepSliderValue(TextComponent text, List<String> options, int initialIndex) {
            this.text = text;
            this.options = options;
            this.initialIndex = initialIndex;
        }
    }
}
