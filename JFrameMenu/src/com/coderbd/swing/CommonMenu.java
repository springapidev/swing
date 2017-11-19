package com.coderbd.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author Rajaul Islam
 */
public class CommonMenu {

    public CommonMenu() {
    }

    public static JMenuBar displayMenu(JFrame f) {
        JMenuBar menuBar = new JMenuBar();
        JMenu menu1 = new JMenu("File");

        JMenuItem itemMain = new JMenuItem("Main Page");
        itemMain.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new JFrameMain().setVisible(true);
            }
        });

        JMenuItem item1 = new JMenuItem("Page One");
        item1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new JFrameOne().setVisible(true);
            }
        });

        JMenuItem item2 = new JMenuItem("Page Two");
        item2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new JFrameTwo().setVisible(true);
            }
        });

        JMenuItem item3 = new JMenuItem("Page Three");
        item3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new JFrameThree().setVisible(true);
            }
        });

        menu1.add(item1);
        menu1.addSeparator();
        menu1.add(item2);
        menu1.addSeparator();
        menu1.add(item3);
        menu1.addSeparator();
        menu1.add(itemMain);
        JMenu menu2 = new JMenu("Help");

        menuBar.add(menu1);
        menuBar.add(menu2);
        
        f.setExtendedState(JFrame.MAXIMIZED_BOTH);
        return menuBar;
    }

}
