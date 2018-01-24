/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.common;

import com.coderbd.view.ChangePassView;
import com.coderbd.view.LoginView;
import com.coderbd.view.ManualAttendance;
import com.coderbd.view.OrderView;
import com.coderbd.view.ProductRecieveView;
import com.coderbd.view.ProfileView;
import com.coderbd.view.RackView;
import com.coderbd.view.dashboard.DashboardForBM;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author Instructor
 */
public class MenuForBranchManager {

    public static JMenuBar displayMenu(JFrame f) {
        JMenuBar menuBar = new JMenuBar();
        JMenu menu1 = new JMenu("File");
        JMenu menu2 = new JMenu("Profile");
        JMenuItem itemForSADash = new JMenuItem("Dashboard");
        itemForSADash.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new DashboardForBM().setVisible(true);
            }
        });

        JMenuItem itemForRack = new JMenuItem("Rack");
        itemForRack.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new RackView().setVisible(true);
            }
        });

        JMenuItem itemForOrder = new JMenuItem("Order");
        itemForOrder.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new OrderView().setVisible(true);
            }
        });

        JMenuItem itemForManualAtt = new JMenuItem("Attendance");
        itemForManualAtt.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new ManualAttendance().setVisible(true);
            }
        });

        JMenuItem itemForProductReceieve = new JMenuItem("Product Recieve");
        itemForProductReceieve.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new ProductRecieveView().setVisible(true);
            }
        });

        JMenuItem itemForProfile = new JMenuItem("Profile");
        itemForProfile.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new ProfileView().setVisible(true);
            }
        });

        JMenuItem itemForChangePass = new JMenuItem("Change Password");
        itemForChangePass.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new ChangePassView().setVisible(true);
            }
        });

        JMenuItem itemForLogout = new JMenuItem("Logout");
        itemForLogout.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new LoginView().setVisible(true);
            }
        });
        menu1.add(itemForSADash);
        menu1.add(itemForOrder);
        menu1.add(itemForProductReceieve);
        menu1.add(itemForRack);
        menu1.add(itemForManualAtt);
        menu2.add(itemForProfile);
        menu2.add(itemForChangePass);
        menu2.add(itemForLogout);
        //Now add Menu at Menubar
        menuBar.add(menu1);
        menuBar.add(menu2);
        //It will Make Page Full Screen Mode
        f.setExtendedState(JFrame.MAXIMIZED_BOTH);
        return menuBar;
    }
}
