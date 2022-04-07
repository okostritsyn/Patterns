package main.java.abstract_factory.factories;

import main.java.abstract_factory.buttons.Button;
import main.java.abstract_factory.buttons.WindowsButton;
import main.java.abstract_factory.checkboxes.Checkbox;
import main.java.abstract_factory.checkboxes.WindowsCheckbox;

/**
 * Каждая конкретная фабрика знает и создаёт только продукты своей вариации.
 */
public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
