package oop.task_06_watch.Maker;
import oop.task_06_watch.Watch.DigitalWatch;
import oop.task_06_watch.Watch.Watch;

/**
 * Created by Михаил on 24.03.2017.
 */
public class DigitalMaker implements WatchMaker {
    @Override

    public Watch makeWatch() {
        return new DigitalWatch();
    }
}
