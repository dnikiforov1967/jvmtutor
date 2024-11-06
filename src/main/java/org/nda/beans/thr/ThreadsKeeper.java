package org.nda.beans.thr;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public enum ThreadsKeeper {
    THREADS_KEEPER;

    private volatile Thread regularThread;

    public synchronized void initiateRegularThread() {
        if (Objects.isNull(regularThread) || !regularThread.isAlive()) {
            regularThread = new Thread(()->{
                while(!Thread.interrupted()) {
                    System.out.println("Regular thread: "+LocalDateTime.now());
                    try {
                        TimeUnit.MILLISECONDS.sleep(1000);
                    } catch (InterruptedException e) {
                        break;
                    }
                }
            });
            regularThread.start();
        }
    }

    public synchronized void stopRegularThread() {
        if (Objects.nonNull(regularThread) && regularThread.isAlive()) {
            regularThread.interrupt();
        }
    }
}
