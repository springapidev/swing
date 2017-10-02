/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.ewojt.dao;

import eu.ewjot.model.Contact;
import eu.ewojt.dao.config.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author iwonaw
 */
public class ContactDAO {

    private Connection conn;

    public ContactDAO() {
        conn = new ConnectionFactory().getSQLConnection();
    }

    /**
     * Save a new Contact in the database.
     *
     * @param contact an Object type Contact
     */
    public void save(Contact contact) {
        try {
            // creating a preparedStatement
            String sql = "insert into contact "
                    + " (firstname, lastname, email, phone, street, streetnumber, city, state, zip)"
                    + " values (?,?,?,?,?,?,?,?,?)";

            PreparedStatement stmt = conn.prepareStatement(sql);

            // fill the values
            stmt.setString(1, contact.getFirstName());
            stmt.setString(2, contact.getLastName());
            stmt.setString(3, contact.getEmailAdress());
            stmt.setString(4, contact.getPhoneNumer());
            stmt.setString(5, contact.getStreet());
            stmt.setInt(6, contact.getStreetNumber());
            stmt.setString(7, contact.getCity());
            stmt.setString(8, contact.getState());
            stmt.setString(9, contact.getZip());

            // execute
            stmt.execute();
            stmt.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Retrieve all Contacts on database
     *
     * that means select * from ...
     *
     * @return
     */
    public List<Contact> getAll() {
        List<Contact> all = new ArrayList<Contact>();
        try {
            PreparedStatement stmt = conn.prepareStatement("select * from contact");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                // Creating a object
                Contact contact = new Contact();
                contact.setFirstName(rs.getString("firstname"));
                contact.setLastName(rs.getString("lastname"));
                contact.setEmailAdress(rs.getString("email"));
                contact.setPhoneNumer(rs.getString("phone"));
                contact.setStreet(rs.getString("street"));
                contact.setStreetNumber(Integer.parseInt(rs.getString("streetnumber")));
                contact.setCity(rs.getString("city"));
                contact.setState(rs.getString("state"));
                contact.setZip(rs.getString("zip"));
                contact.setId(Integer.parseInt(rs.getString("idContact")));
                //adding object in the list
                all.add(contact);
            }
            rs.close();
            stmt.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return all;
    }

    /**
     * Updating Contact by address.
     *
     * @param contact
     */
    public void update(Contact contact) {
        String sql = "update contact set street=?, streetnumber=?, "
                + "city=?, state=?, zip=? where idContact=?";

        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, contact.getStreet());
            stmt.setInt(2, contact.getStreetNumber());
            stmt.setString(3, contact.getCity());
            stmt.setString(4, contact.getState());
            stmt.setString(5, contact.getZip());
            stmt.setInt(6, contact.getId());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Get Contact by Id.
     *
     * @param idContact the address id
     * @return The address
     */
    public Contact getById(int idContact) {
        Contact contact = new Contact();
        try {
            String sql = "select * from contact where idContact=" + String.valueOf(idContact);

            PreparedStatement stmt = conn.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                contact.setFirstName(rs.getString("firstname"));
                contact.setLastName(rs.getString("lastname"));
                contact.setEmailAdress(rs.getString("email"));
                contact.setPhoneNumer(rs.getString("phone"));
                contact.setStreet(rs.getString("street"));
                contact.setStreetNumber(Integer.parseInt(rs.getString("streetnumber")));
                contact.setCity(rs.getString("city"));
                contact.setState(rs.getString("state"));
                contact.setZip(rs.getString("zip"));
                contact.setId(Integer.parseInt(rs.getString("idContact")));
            }
            rs.close();
            stmt.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return contact;
    }

    /**
     * Deleting contact in the database.
     *
     * @param contact
     */
    public void delete(Contact contact) {
        try {
            PreparedStatement stmt = conn.prepareStatement("delete from contact where idContact=?");
            stmt.setInt(1, contact.getId());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
