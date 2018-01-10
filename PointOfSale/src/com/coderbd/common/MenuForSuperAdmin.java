/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.common;

import com.coderbd.view.BranchView;
import com.coderbd.view.CompanyView;
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
public class MenuForSuperAdmin {
    
    public static JMenuBar displayMenu(JFrame f){
    JMenuBar menuBar=new JMenuBar();
        JMenu menu1=new JMenu("File");
        
        JMenuItem itemForCompany=new JMenuItem("Add Company");
        itemForCompany.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
          f.setVisible(false);
          new CompanyView().setVisible(true);
        }
    });
       
         JMenuItem itemForBranch = new JMenuItem("Add Branch");
        itemForBranch.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
          f.setVisible(false);
          new BranchView().setVisible(true);
        }
    });
        
        menu1.add(itemForCompany);
        menu1.add(itemForBranch);
        menuBar.add(menu1);
    
    return menuBar;
    }
}
