package com.withing.corrent.thread;


import com.withing.concurrent.thread.*;
import org.junit.*;

public class ThreadTest {

    @Test
    public void createByThreadTest() {
        CreateByThread createByThread = new CreateByThread();
        createByThread.runThread();
    }
}
