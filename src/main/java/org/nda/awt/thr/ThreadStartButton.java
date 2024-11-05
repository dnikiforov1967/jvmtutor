package org.nda.awt.thr;

import javax.swing.*;

import static org.nda.beans.thr.ThreadsKeeper.THREADS_KEEPER;

public class ThreadStartButton extends JButton {

    public ThreadStartButton() {
        super("Start regular thread");
        this.addActionListener((ae)->{
            THREADS_KEEPER.initiateRegularThread();
        });
    }
}
