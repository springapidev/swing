package ex01.creatingawindow;

import javax.swing.JFrame;

public class Ex01CreatingAwindow {
 
    public static void main(String[] args) {
        JFrame aWindow = new JFrame("First Window");
        aWindow.setBounds(250, 300, 400, 250);
        aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aWindow.setVisible(true);
    }
    
}
