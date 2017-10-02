/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.ewojt.controllers;

import eu.ewjot.model.Contact;
import eu.ewojt.dao.ContactDAO;
import java.util.List;

/**
 *
 * @author iwonaw
 */
public class ContactRegisterController {

    /**
     * Constructor
     */
    public ContactRegisterController() {

    }

    /**
     * This method save a new Address in the database.
     *
     * @param name
     * @param lastname
     * @param phone
     * @param email
     * @param street
     * @param streetnumber
     * @param city
     * @param state
     * @param zip
     */
    public void newAddress(String name, String lastname, String phone, String email ,String street, int streetnumber, String city, String state, String zip) {
        Contact contact = new Contact(name, lastname, phone, email, street, streetnumber, city, state, zip);
        ContactDAO dao = new ContactDAO();
        dao.save(contact);
    }

    /**
     * Getting all Contacts in the database.
     *
     * @return an Contact list.
     */
    public List<Contact> listContacts() {
        ContactDAO dao = new ContactDAO();
        return dao.getAll();
    }

    /**
     * Updating an Contact.
     *
     * @param idContact the id
     * @param name the name
     * @param lastname the surname
     * @param phone the phone number
     * @param email the email address
     * @param street the street name
     * @param streetnumber the house number
     * @param city the city name
     * @param state the state name
     * @param zip the zip code number
     *
     */
    public void updateAddress(int idContact, String name, String lastname, String phone, String email, String street, int streetnumber, String city, String state, String zip) {
        Contact contact = new Contact(name, lastname, phone, email,street, streetnumber, city, state, zip);
        contact.setId(idContact);
        ContactDAO dao = new ContactDAO();
        dao.update(contact);
    }

    /**
     * Deleting an Address by Id Contact.
     *
     * @param idContact the id contact
     */
    public void deleteAddress(int idContact) {
        ContactDAO dao = new ContactDAO();
        Contact address = dao.getById(idContact);
        dao.delete(address);
    }

    /**
     * Validating the typed informations.
     *
     * @param name
     * @param lastname
     * @param phone
     * @param city
     * @return
     */
    public boolean validate(String name, String lastname, String phone, String city) {
        return !name.isEmpty()
                && !phone.isEmpty()
                && !lastname.isEmpty()
                && !city.isEmpty();
    }
}
