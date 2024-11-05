package org.nda.awt.thr;

import javax.swing.*;

import static org.nda.beans.thr.ThreadsKeeper.THREADS_KEEPER;

public class ThreadStopButton extends JButton {

    public ThreadStopButton() {
        super("Stop regular thread");
        this.addActionListener((ae)->{
            THREADS_KEEPER.stopRegularThread();
        });
    }
}
