package oop.task_06_watch.Watch;

import java.util.Date;

/**
 * Created by Михаил on 24.03.2017.
 */
public class DigitalWatch implements Watch {
    @Override
    public void showTime() {
        System.out.println(new Date());

    }
}
