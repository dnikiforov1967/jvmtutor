package org.nda.awt.thr;

import javax.swing.*;

import static org.nda.beans.thr.ThreadBlocker.BLOCKER;

public class BlockeeStartButton extends JButton {

    public BlockeeStartButton() {
        super("Start blockee thread");
        this.addActionListener((ae)->{
            BLOCKER.startBlockee();
        });
    }
}
