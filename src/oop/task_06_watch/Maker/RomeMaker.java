package oop.task_06_watch.Maker;

import oop.task_06_watch.Watch.RomeWatch;
import oop.task_06_watch.Watch.Watch;

public class RomeMaker implements WatchMaker {
    @Override
    public Watch makeWatch() {
        return new RomeWatch();
    }
}
