package oop.task_04_factory.Gui;

import oop.task_04_factory.Button.Button;
import oop.task_04_factory.Button.LinuxButton;

/**
 * Created by Михаил on 23.03.2017.
 */
public class UbuntuGuiFactory implements GuiFactory {

    @Override
    public Button createButton() {
        return new LinuxButton("uuuuuuuuu");
    }
}