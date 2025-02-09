package ch10.callBack.timer;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelamPrinter implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Selaaammm :)");
        System.out.println(e.getSource());
        Toolkit.getDefaultToolkit().beep();
    }
}
