/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.view;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

/**
 *
 * @author Students
 */
public class CommonMenu {

    public void getCommonMenu(JFrame f) {
        JMenuBar menuBar = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenuItem dashbItem = new JMenuItem("DashBoard");
        dashbItem.setMnemonic('D');
        dashbItem.setAccelerator(KeyStroke.getKeyStroke('D', InputEvent.CTRL_DOWN_MASK));
        dashbItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new DashBoardView().setVisible(true);
            }
        });
        dashbItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/coderbd/view/ic.png")));
        file.add(dashbItem);

        JMenuItem pc = new JMenuItem("Product Category");
        pc.setMnemonic('Q');
        pc.setAccelerator(KeyStroke.getKeyStroke('Q', InputEvent.CTRL_DOWN_MASK));
        pc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new ProductCategoryView().setVisible(true);
            }
        });
        pc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/coderbd/view/ic.png")));
        file.add(pc);

        JMenuItem p = new JMenuItem("Product");
        p.setMnemonic('P');
        p.setAccelerator(KeyStroke.getKeyStroke('P', InputEvent.CTRL_DOWN_MASK));
        p.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new ProductView().setVisible(true);
            }
        });
        p.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/coderbd/view/ic.png")));

        file.add(p);

        JMenuItem purchase = new JMenuItem("Purchase");
        purchase.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new PurchaseView().setVisible(true);
            }
        });
        purchase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/coderbd/view/ic.png")));
        file.add(purchase);

        JMenuItem sales = new JMenuItem("Sales");
        sales.setMnemonic('S');
        sales.setAccelerator(KeyStroke.getKeyStroke('S', InputEvent.CTRL_DOWN_MASK));
        sales.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new SalesView().setVisible(true);
            }
        });
        sales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/coderbd/view/ic.png")));
        file.add(sales);

        JMenuItem summary = new JMenuItem("Summary");
        summary.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new SummaryView().setVisible(true);
            }
        });
        summary.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/coderbd/view/ic.png")));
        file.add(summary);
        JMenuItem report = new JMenuItem("Report");
        report.setMnemonic('R');
        report.setAccelerator(KeyStroke.getKeyStroke('R', InputEvent.CTRL_DOWN_MASK));
        report.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new ReportView().setVisible(true);
            }
        });
        report.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/coderbd/view/ic.png")));
        file.add(report);
        menuBar.add(file);
        f.setJMenuBar(menuBar);
        f.setExtendedState(JFrame.MAXIMIZED_BOTH);
        f.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo.png")));
    }
}
