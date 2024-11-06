package org.nda.beans.thr;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

public enum ThreadBlocker {
    BLOCKER;

    private volatile Thread blocker;
    private volatile Thread blockee;

    public void startBlocker() {
        if (Objects.isNull(blocker) || !blocker.isAlive()) {
            blocker = new Thread(() -> {
                synchronized (BLOCKER) {
                    while (!Thread.interrupted()) {
                        System.out.println("Blocker alive");
                        try {
                            TimeUnit.MILLISECONDS.sleep(1000);
                        } catch (InterruptedException e) {
                            break;
                        }
                    }
                }
            });
            blocker.start();
        }
    }

    public void stopBlocker() {
        if (Objects.nonNull(blocker)) {
            blocker.interrupt();
        }
    }

    public void startBlockee() {
        if (Objects.isNull(blockee) || !blockee.isAlive()) {
            blockee = new Thread(()->{
                synchronized (BLOCKER) {
                    System.out.println("Blockee alive");
                }
            });
            blockee.start();
        }
    }
}
