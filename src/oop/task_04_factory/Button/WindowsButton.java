package oop.task_04_factory.Button;

/**
 * Created by Михаил on 23.03.2017.
 */
public class WindowsButton implements Button {
    private String look;

    public WindowsButton(String look) {
        this.look = look;
    }

    @Override
    public String getLook() {
        return look;
    }
}