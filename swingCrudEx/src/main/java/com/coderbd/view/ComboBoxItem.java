/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.view;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.plaf.basic.*;

public class ComboBoxItem extends JFrame implements ActionListener
{
    public ComboBoxItem()
    {
        Vector model = new Vector();
        model.addElement( new Item(1, "car" ) );
        model.addElement( new Item(2, "plane" ) );
        model.addElement( new Item(3, "train" ) );
        model.addElement( new Item(4, "boat" ) );

        JComboBox comboBox;

        //  Easiest approach is to just override toString() method
        //  of the Item class

        comboBox = new JComboBox( model );
        
        comboBox.addActionListener( this );
        getContentPane().add(comboBox, BorderLayout.NORTH );

        //  Most flexible approach is to create a custom render
        //  to diplay the Item data

        comboBox = new JComboBox( model );
      
        comboBox.setRenderer( new ItemRenderer() );
        comboBox.addActionListener( this );
        getContentPane().add(comboBox, BorderLayout.SOUTH );
    }

    public void actionPerformed(ActionEvent e)
    {
        JComboBox comboBox = (JComboBox)e.getSource();
        Item item = (Item)comboBox.getSelectedItem();
        System.out.println( item.getId() + " : " + item.getDescription() );
    }

    class ItemRenderer extends BasicComboBoxRenderer
    {
        public Component getListCellRendererComponent(
            JList list, Object value, int index,
            boolean isSelected, boolean cellHasFocus)
        {
            super.getListCellRendererComponent(list, value, index,
                isSelected, cellHasFocus);

            if (value != null)
            {
                Item item = (Item)value;
                setText( item.getDescription().toUpperCase() );
            }

            if (index == -1)
            {
                Item item = (Item)value;
                setText( "" + item.getId() );
            }


            return this;
        }
    }

    class Item
    {
        private int id;
        private String description;

        public Item(int id, String description)
        {
            this.id = id;
            this.description = description;
        }

        public int getId()
        {
            return id;
        }

        public String getDescription()
        {
            return description;
        }

        public String toString()
        {
            return description;
        }
    }

    public static void main(String[] args)
    {
        JFrame frame = new ComboBoxItem();
        frame.setDefaultCloseOperation( EXIT_ON_CLOSE );
        frame.pack();
        frame.setVisible( true );
     }

}