package org.nda;


import org.nda.awt.mem.FillMemoryButton;
import org.nda.awt.MainFrame;
import org.nda.awt.thr.*;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class DeskScreen {
    public static void main(final String... args) {

        MainFrame screen = new MainFrame();
        screen.setSize(800, 800);
        screen.setLayout(null);

        FillMemoryButton fillMemoryButton = new FillMemoryButton();
        fillMemoryButton.setBounds(20,20,250,30);
        screen.add(fillMemoryButton);

        ThreadStartButton threadStartButton = new ThreadStartButton();
        threadStartButton.setBounds(20,70,250,30);
        screen.add(threadStartButton);

        ThreadStopButton threadStopButton = new ThreadStopButton();
        threadStopButton.setBounds(280,70,250,30);
        screen.add(threadStopButton);

        BlockerStartButton blockerStartButton = new BlockerStartButton();
        blockerStartButton.setBounds(20,120,250,30);
        screen.add(blockerStartButton);

        BlockerStopButton blockerStopButton = new BlockerStopButton();
        blockerStopButton.setBounds(280,120,250,30);
        screen.add(blockerStopButton);

        BlockeeStartButton blockeeStartButton = new BlockeeStartButton();
        blockeeStartButton.setBounds(540,120,250,30);
        screen.add(blockeeStartButton);

        screen.setVisible(true);


        screen.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });

    }

}