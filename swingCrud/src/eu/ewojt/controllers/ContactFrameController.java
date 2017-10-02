/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eu.ewojt.controllers;

import eu.ewojt.dao.ContactDAO;
import eu.ewojt.ui.ContactFrame;
import eu.ewojt.ui.model.ContactTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author iwonaw
 */
public class ContactFrameController {

    ContactFrame cframe;
    ContactTableModel model;
    
    public ContactFrameController() {
        ContactDAO cdao = new ContactDAO();
        model = new ContactTableModel( cdao.getAll());
        cframe = new ContactFrame( model );
        cframe.addAddActionListener(new AddAction());
        cframe.addDeleteActionListener(null);
        cframe.addEditActionListener(null);
        cframe.addExitActionListener(null);
        cframe.addViewActionListener(null);
        cframe.setVisible(true);
    }
    
    //Inner class
    class AddAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
           
        }
    }
    
        //Inner class
    class DeleteAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
           
        }
    }
    
        //Inner class
    class EditAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
           
        }
    }
    
        //Inner class
    class ViewAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
           
        }
    }
    
        //Inner class
    class ExitAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
           
        }
    }
}
