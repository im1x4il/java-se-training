package oop.task_04_factory.Button;

/**
 * Created by Михаил on 23.03.2017.
 */
public class LinuxButton implements Button {
    private String look;

    public LinuxButton(String look) {
        this.look = look;
    }

    @Override
    public String getLook() {
        return look;
    }
}