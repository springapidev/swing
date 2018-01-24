/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.common;

import com.coderbd.view.BrandView;
import com.coderbd.view.CategoryView;
import com.coderbd.view.ChangePassView;
import com.coderbd.view.LoginView;
import com.coderbd.view.OfferView;
import com.coderbd.view.ProductIssueView;
import com.coderbd.view.ProductPurchaseView;
import com.coderbd.view.ProductTypeView;
import com.coderbd.view.ProfileView;
import com.coderbd.view.dashboard.DashboardForSalesmanger;
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
public class MenuForSalesManager {

    public static JMenuBar displayMenu(JFrame f) {
        JMenuBar menuBar = new JMenuBar();
        JMenu menu1 = new JMenu("File");
        JMenu menu2 = new JMenu("Profile");
        JMenuItem itemForSADash = new JMenuItem("Dashboard");
        itemForSADash.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new DashboardForSalesmanger().setVisible(true);
            }
        });

        JMenuItem itemForOffer = new JMenuItem("Offer");
        itemForOffer.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new OfferView().setVisible(true);
            }
        });
        JMenuItem itemForProductIssue = new JMenuItem("Product Issue");
        itemForProductIssue.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new ProductIssueView().setVisible(true);
            }
        });
        JMenuItem itemForProductBrand = new JMenuItem("Product Brand");
        itemForProductBrand.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new BrandView().setVisible(true);
            }
        });

        JMenuItem itemForProductType = new JMenuItem("Product Type");
        itemForProductType.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new ProductTypeView().setVisible(true);
            }
        });
        JMenuItem itemForProductCategory = new JMenuItem("Product Category");
        itemForProductCategory.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new CategoryView().setVisible(true);
            }
        });

        JMenuItem itemForProductPurchase = new JMenuItem("Product Purchase");
        itemForProductPurchase.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new ProductPurchaseView().setVisible(true);
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
        menu1.add(itemForOffer);
        menu1.add(itemForProductIssue);
        menu1.add(itemForProductBrand);
        menu1.add(itemForProductType);
        menu1.add(itemForProductCategory);
        menu1.add(itemForProductPurchase);

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
