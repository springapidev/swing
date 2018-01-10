/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.common;

import com.coderbd.view.Dashboard;
import com.coderbd.view.Purchase;
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
public class MenuForAdmin {
    
    public static JMenuBar displayMenu(JFrame f){
    JMenuBar menuBar=new JMenuBar();
        JMenu menu1=new JMenu("File");
        
        JMenuItem itemForPurchase=new JMenuItem("Purchase");
        itemForPurchase.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
          f.setVisible(false);
          new Purchase().setVisible(true);
        }
    });
       
         JMenuItem itemForDashboard=new JMenuItem("Dashboard");
        itemForDashboard.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
          f.setVisible(false);
          new Dashboard().setVisible(true);
        }
    });
        
        menu1.add(itemForPurchase);
        menuBar.add(menu1);
    
    return menuBar;
    }
}
