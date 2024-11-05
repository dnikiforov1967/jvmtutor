package org.nda.awt.mem;

import javax.swing.*;

import static org.nda.beans.mem.ObjectsKeeper.KEEPER;


public class FillMemoryButton extends JButton {

    public FillMemoryButton() {
        super("Load byte[1024*1024] in memory");
        this.addActionListener((ae)->{
            KEEPER.byteExample = new byte[1024*1024];
            for(int i = 0; i < 1024*1024; i++)
                KEEPER.byteExample[i] = 'a';
            System.out.println("Loaded "+KEEPER.byteExample.length);
        });
    }

}
