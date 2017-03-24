package oop.task_04_factory;

import oop.task_04_factory.Button.Button;
import oop.task_04_factory.Gui.GuiFactory;
import oop.task_04_factory.Gui.UbuntuGuiFactory;
import oop.task_04_factory.Gui.Win10GuiFactory;

/**
 * Created by Михаил on 23.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        GuiFactory factory = getAppropriateGUIFactory();
        Button button = factory.createButton();
        showButton(button);

        GuiFactory factory1 = getAppropriateGUIFactory();
        Button button1 = factory1.createButton();
        showButton(button1);
    }

    // сюда нам нужна Кнопка
    public static void showButton(Button button) {
        // some implementation
        //...
        System.out.println(button.getLook());
    }

    // отсюда мы получаем правильную для ОС Фабрику кнопок и тд.
    public static GuiFactory getAppropriateGUIFactory() {
        // some implementation
        //...
        GuiFactory[] factories = {new UbuntuGuiFactory(), new Win10GuiFactory()};
        int idx = (int)(Math.random() * 2);
        GuiFactory factory = factories[idx];
        return factory;
    }
}