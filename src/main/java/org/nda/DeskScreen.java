package org.nda;


import org.nda.awt.mem.FillMemoryButton;
import org.nda.awt.MainFrame;
import org.nda.awt.thr.ThreadStartButton;
import org.nda.awt.thr.ThreadStopButton;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import static org.nda.beans.mem.ObjectsKeeper.KEEPER;
import static org.nda.beans.thr.ThreadsKeeper.THREADS_KEEPER;

public class DeskScreen {
    public static void main(final String... args) {

        MainFrame screen = new MainFrame();
        screen.setSize(400, 400);
        screen.setVisible(true);
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



        screen.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });

    }

}