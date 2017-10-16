package ex01.creatingawindow;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class ColorAndCursor {

    public static void main(String[] args) {
        JFrame aWindow = new JFrame("Resized Window");
        Toolkit thekit = aWindow.getToolkit();
        Dimension wndSize = thekit.getScreenSize();        
        aWindow.setBounds(wndSize.width / 4, wndSize.height / 4, wndSize.width / 2, wndSize.height / 2);
        aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aWindow.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
        aWindow.getContentPane().setBackground(Color.red);
        aWindow.setVisible(true);
    }
    
}
