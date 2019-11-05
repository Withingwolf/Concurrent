package com.withing.concurrent.thread;

import com.google.common.collect.*;
import com.withing.concurrent.thread.domain.*;

import java.util.*;

public class CreateByThread {

    public void runThread() {
        List<MyThread> myThreadList = Lists.newArrayList();
        for (int i = 0; i < 10; i++) {
            myThreadList.add(new MyThread());
        }
        for (MyThread t : myThreadList) {
            t.start();
        }
    }

}
