package org.nda.awt.thr;

import javax.swing.*;

import static org.nda.beans.thr.ThreadBlocker.BLOCKER;
import static org.nda.beans.thr.ThreadsKeeper.THREADS_KEEPER;

public class BlockerStopButton extends JButton {

    public BlockerStopButton() {
        super("Stop blocker thread");
        this.addActionListener((ae)->{
            BLOCKER.stopBlocker();
        });
    }
}
