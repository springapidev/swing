package com.coderbd.util;

import com.coderbd.view.About;
import com.coderbd.view.Dashboard;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

public class CommonMenu {
    
    public static JMenuBar getCommonMenu(JFrame f) {
        JMenuBar menuBar = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenuItem itemDashboard = new JMenuItem("DashBoard");
        itemDashboard.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new Dashboard().setVisible(true);
            }
        });
        
        JMenuItem itemAbout = new JMenuItem("About");
        itemAbout.setAccelerator(KeyStroke.getKeyStroke('A', InputEvent.CTRL_DOWN_MASK));
//        Action aboutAction = new AbstractAction("About") {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                f.setVisible(false);
//                new About().setVisible(true);
//            }
//        };
//        aboutAction.putValue(Action.ACCELERATOR_KEY,
//                KeyStroke.getKeyStroke(KeyEvent.VK_A, KeyEvent.CTRL_DOWN_MASK));
//        itemAbout.setAction(aboutAction);

        itemAbout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new About().setVisible(true);
            }
        });
        JMenuItem itemExit = new JMenuItem("Exit");
        itemExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                //new Login().setVisible(true);

                int dialogResult = JOptionPane.showConfirmDialog(null, "Would You Like to Really Close?", "Warning", 0);
                if (dialogResult == JOptionPane.YES_OPTION) {
                    // Saving code here
                    System.exit(0);
                }
            }
        });
        
        JMenu help = new JMenu("Help");
        // add 2 menu item at file menu
        file.add(itemDashboard);
        file.add(itemAbout);
        file.add(itemExit);
        //add menu at menubar
        menuBar.add(file);
        menuBar.add(help);
        f.setJMenuBar(menuBar);
        f.setExtendedState(JFrame.MAXIMIZED_BOTH);
        return menuBar;
    }
}
