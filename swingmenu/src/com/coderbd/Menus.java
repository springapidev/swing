/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author Rajail Islam
 */
public class Menus {

    public Menus() {

    }

    public static JMenuBar displayMenu(JFrame f) {
        JMenuBar menuBar = new JMenuBar();
        JMenu menu1 = new JMenu("File");
        menuBar.add(menu1);
        menuBar.add(new JMenu("Help"));
        JMenuItem m1 = new JMenuItem("Dash Board");
        m1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new DashBoard().setVisible(true);
            }
        });
        menu1.add(m1);
        JMenuItem m2 = new JMenuItem("Dynamic Menu");
        m2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new DynamicswingMenu().setVisible(true);
            }
        });
        menu1.add(m2);

       // f.setExtendedState(JFrame.MAXIMIZED_BOTH);
     

        return menuBar;
    }
}
