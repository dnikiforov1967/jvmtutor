package org.nda.awt.thr;

import javax.swing.*;

import static org.nda.beans.thr.ThreadBlocker.BLOCKER;
import static org.nda.beans.thr.ThreadsKeeper.THREADS_KEEPER;

public class BlockerStartButton extends JButton {

    public BlockerStartButton() {
        super("Start blocker thread");
        this.addActionListener((ae)->{
            BLOCKER.startBlocker();
        });
    }
}
