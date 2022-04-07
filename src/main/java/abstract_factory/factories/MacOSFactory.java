package main.java.abstract_factory.factories;

import main.java.abstract_factory.buttons.Button;
import main.java.abstract_factory.buttons.MacOSButton;
import main.java.abstract_factory.checkboxes.Checkbox;
import main.java.abstract_factory.checkboxes.MacOSCheckbox;

/**
 * Каждая конкретная фабрика знает и создаёт только продукты своей вариации.
 */
public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}