package ru.vsu.cs.maslovaei;

import ru.vsu.cs.Utils.SwingUtils;

import javax.swing.*;
import java.util.Locale;

public class GuiMain {

    public static void main(String[] args) throws Exception {
        winMain();
    }

    public static void winMain() throws Exception {
        SwingUtils.setLookAndFeelByName("Windows");
        Locale.setDefault(Locale.ROOT);
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        SwingUtils.setDefaultFont("Microsoft Sans Serif", 18);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameMain().setVisible(true);
            }
        });
    }
}
