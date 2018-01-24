/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.common;

import com.coderbd.view.BranchView;
import com.coderbd.view.ChangePassView;
import com.coderbd.view.CompanyView;
import com.coderbd.view.LoginView;
import com.coderbd.view.ProfileView;
import com.coderbd.view.SalesView;
import com.coderbd.view.UserRegiView;
import com.coderbd.view.dashboard.DashboardForSalesman;
import com.coderbd.view.dashboard.DashboardForSuperAdmin;
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
public class MenuForSalesMan {
   
    public static JMenuBar displayMenu(JFrame f) {
        JMenuBar menuBar = new JMenuBar();
        JMenu menu1 = new JMenu("File");
        JMenu menu2 = new JMenu("Profile");
        JMenuItem itemForSADash = new JMenuItem("Dashboard");
        itemForSADash.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new DashboardForSalesman().setVisible(true);
            }
        });

        JMenuItem itemForCompany = new JMenuItem("Sales");
        itemForCompany.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new SalesView().setVisible(true);
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
        menu1.add(itemForCompany);
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
