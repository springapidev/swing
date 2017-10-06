package com.coderbd.service;

import com.coderbd.connection.DbConnection;
import com.coderbd.dao.PersonDAO;
import com.coderbd.domain.Person;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rajail Islam
 */
public class PersonService implements PersonDAO {

    Connection conn = DbConnection.getConnection();

    /**
     * private String name; private String email; private String birthDate;
     * private String gender; private String hobby; private String country;
     * private String note;
     *
     * @param p
     */
    @Override
    public void save(Person p) {
        try {
            if (p.getName() != null) {
                PreparedStatement stmt = conn.prepareStatement("insert into tbl_person(name,email,birthDate,gender,hobby,country,note ) values(?,?,?,?,?,?,?)");

                stmt.setString(1, p.getName());
                stmt.setString(2, p.getEmail());
                stmt.setString(3, p.getBirthDate());
                stmt.setString(4, p.getGender());
                stmt.setString(5, p.getHobby());
                stmt.setString(6, p.getCountry());
                stmt.setString(7, p.getNote());

                int i = stmt.executeUpdate();
                System.out.println(i + " records inserted");
            }
            // con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Person.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Person p) {
        try {
            if (p.getId() != 0) {
                /*     String sql = "update tbl_person set "
                        + "name=" + p.getName()
                        + "," + "email=" + p.getEmail()
                        + "," + "birthDate=" + p.getBirthDate()
                        + "," + "gender=" + p.getGender()
                        + "," + "hobby=" + p.getHobby()
                        + "," + "country=" + p.getCountry()
                        + "," + p.getNote() + " where id=" + p.getId();
                System.out.println(sql);*/
                PreparedStatement stmt = conn.prepareStatement("update tbl_person SET name=?, email=?, birthDate=?, gender=?, hobby=?, country=?, note=?  where id=?");
                stmt.setInt(1, p.getId());
                stmt.setString(2, p.getName());
                stmt.setString(3, p.getEmail());
                stmt.setString(4, p.getBirthDate());
                stmt.setString(5, p.getGender());
                stmt.setString(6, p.getHobby());
                stmt.setString(7, p.getCountry());
                stmt.setString(8, p.getNote());
                int i = stmt.executeUpdate();
                System.out.println(i + " records Updated");
            }
            // con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Person.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(int id) {
        try {
            if (id != 0) {
                PreparedStatement stmt = conn.prepareStatement("delete from tbl_person where id=?");

                stmt.setInt(1, id);

                int i = stmt.executeUpdate();
                System.out.println(i + " records Deleted");
            }
            // con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Person.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Person> getPersons() {
        List<Person> list = new ArrayList<>();
        try {
            Person p;
            PreparedStatement stmt = conn.prepareStatement("select *from tbl_person");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                p = new Person();
                p.setId(rs.getInt(1));
                p.setName(rs.getString(2));
                p.setEmail(rs.getString(3));
                p.setBirthDate(rs.getString(4));
                p.setGender(rs.getString(5));
                p.setHobby(rs.getString(6));
                p.setCountry(rs.getString(7));
                p.setNote(rs.getString(8));
                list.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Person.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public Person getPerson(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
