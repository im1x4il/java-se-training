package oop.task_06_watch;

import oop.task_06_watch.Maker.DigitalMaker;
import oop.task_06_watch.Maker.WatchMaker;
import oop.task_06_watch.Watch.Watch;



/**
 * Created by Михаил on 24.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        WatchMaker maker = new DigitalMaker();
        Watch watch = maker.makeWatch();
        watch.showTime();


    }
}
