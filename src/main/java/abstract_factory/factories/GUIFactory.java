package main.java.abstract_factory.factories;

import main.java.abstract_factory.buttons.Button;
import main.java.abstract_factory.checkboxes.Checkbox;

/**
 * Абстрактная фабрика знает обо всех (абстрактных) типах продуктов.
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}