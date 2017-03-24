package oop.task_04_factory.Gui;

import oop.task_04_factory.Button.Button;
import oop.task_04_factory.Button.WindowsButton;

/**
 * Created by Михаил on 23.03.2017.
 */
public class Win10GuiFactory implements GuiFactory {
    @Override
    public Button createButton() {
        //..configuration..
        return new WindowsButton("wwwww");
    }
}