package de.erdesignerng.visual.common;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.TextField;
import java.awt.Rectangle;
import javax.swing.JTextPane;

public class GuideWindow {

    /**
     * @wbp.parser.entryPoint
     */
    public static void showWindow() {
        JFrame gFrame = new JFrame("Guide");
        gFrame.setBounds(100, 100, 450, 350);
        
        JTextPane txtpnStepsToStart = new JTextPane();
        txtpnStepsToStart.setText("Steps to start using Mogwai Designer:\r\n1. Select Database ->DB Connection, the database connection editor dialog will bi displayed.\r\n2. Then fill the form to continue.\r\n3. After connected, you can start to add table, relations, etc.\r\n\r\n");
        gFrame.getContentPane().add(txtpnStepsToStart, BorderLayout.CENTER);
        gFrame.setVisible(true);
    }
}