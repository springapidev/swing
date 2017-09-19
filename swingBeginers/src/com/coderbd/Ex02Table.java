package com.coderbd;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author Mohammad Rajaul Islam
 */
public class Ex02Table extends JFrame {

    JTable table;

    public Ex02Table() {
        setLayout(new FlowLayout());
        String[] columns = {"First Name", "Last Name"};

        Object[][] rows = {
            {"Sejuti", "Islam"},
            {"Urmi", "Akter"},
            {"Shabib", "Hasan"},
            {"Shamim", "Sarkar"},
            {"Sejuti", "Islam"},
            {"Urmi", "Akter"},
            {"Shabib", "Hasan"},
            {"Sejuti", "Islam"},
            {"Urmi", "Akter"},
            {"Shabib", "Hasan"}};
       
        table = new JTable(rows, columns);
        table.setPreferredScrollableViewportSize(new Dimension(500, 150));
        table.setFillsViewportHeight(true);
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane);

    }

    public static void main(String[] args) {
        Ex02Table ex = new Ex02Table();
        ex.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ex.setSize(600, 500);
        ex.setVisible(true);
        ex.setTitle("My First Swing Table");
    }
}
