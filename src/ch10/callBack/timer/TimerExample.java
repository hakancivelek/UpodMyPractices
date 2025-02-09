package ch10.callBack.timer;

import javax.swing.*;
import java.awt.event.ActionListener;

public class TimerExample {
    public static void main(String[] args) {
        ActionListener actionListener1 = new SelamPrinter();
        ActionListener actionListener2 = new TimePrinter();

        Timer timer1 = new Timer(1000, actionListener1);
        timer1.addActionListener(actionListener2);

        timer1.start();

        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}
