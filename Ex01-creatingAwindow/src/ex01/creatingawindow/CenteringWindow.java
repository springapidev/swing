package ex01.creatingawindow;

import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.Point;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class CenteringWindow {

    public static void main(String[] args) {
        JFrame aWindow = new JFrame("Resized Window");
        Point center = GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
        int windowWidth = 400;
        int windowHeight = 250;
        aWindow.setBounds(center.x-windowWidth/2,center.y-windowHeight, windowWidth, windowHeight);
        aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aWindow.setVisible(true);
    }

}
