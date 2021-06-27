package de.erdesignerng.visual.common;

import javax.swing.JFrame;

public class GuideWindow {

    public static void showWindow() {
        JFrame gFrame = new JFrame("Guide");
        gFrame.setBounds(100, 100, 450, 350);
        gFrame.setVisible(true);
    }
}


