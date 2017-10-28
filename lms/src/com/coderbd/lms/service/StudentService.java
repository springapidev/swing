package com.coderbd.lms.service;

import com.coderbd.lms.connection.DbConnection;
import com.coderbd.lms.dao.StudentDao;
import java.sql.Connection;
import java.util.List;
import com.coderbd.lms.domain.Shift;
import com.coderbd.lms.domain.Student;
import com.coderbd.lms.domain.User;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rajaul Islam
 */
public class StudentService implements StudentDao {

    Connection conn = DbConnection.getConnection();

    @Override
    public void save(Student s) {
        try {
            if (s.getRegistrationNo() != 0) {

                PreparedStatement stmt = conn.prepareStatement("insert into lms_student(`name`,\n"
                        + "`registration_no`,\n"
                        + "`boardRoll_no`,\n"
                        + "`class_roll`,\n"
                        + "`department_id`,\n"
                        + "`shift_id`,\n"
                        + "`house_no`,\n"
                        + "`road_no`,\n"
                        + "`block_or_village`,\n"
                        + "`thana`,\n"
                        + "`district`,\n"
                        + "`division`,\n"
                        + "`country`) values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
                stmt.setString(1, s.getName());
                stmt.setInt(2, s.getRegistrationNo());
                stmt.setInt(3, s.getBoardRollNo());
                stmt.setInt(4, s.getClassRoll());
                stmt.setInt(5, s.getDepartmentId());
                stmt.setInt(6, s.getShiftId());
                stmt.setString(7, s.getHouseNo());
                stmt.setString(8, s.getRoadNo());
                stmt.setString(9, s.getBlockOrVillage());
                stmt.setString(10, s.getThana());
                stmt.setString(11, s.getDistrict());
                stmt.setString(12, s.getDivision());
                stmt.setString(13, s.getCountry());

                int i = stmt.executeUpdate();
                System.out.println(i + " record inserted");
            }
            // con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Shift.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Student s) {
        try {
            if (s.getId() != 0) {
                PreparedStatement stmt = conn.prepareStatement("update lms_student SET name=?,registration_no=?,boardRoll_no=?,class_roll=?,department_id=?,shift_id=?,house_no=?,road_no=?,block_or_village=?,thana=?,district=?,division=?, country=? where id=?");

                stmt.setString(1, s.getName());
                stmt.setInt(2, s.getRegistrationNo());
                stmt.setInt(3, s.getBoardRollNo());
                stmt.setInt(4, s.getClassRoll());
                stmt.setInt(5, s.getDepartmentId());
                stmt.setInt(6, s.getShiftId());
                stmt.setString(7, s.getHouseNo());
                stmt.setString(8, s.getRoadNo());
                stmt.setString(9, s.getBlockOrVillage());
                stmt.setString(10, s.getThana());
                stmt.setString(11, s.getDistrict());
                stmt.setString(12, s.getDivision());
                stmt.setString(13, s.getCountry());
                stmt.setInt(14, s.getId());
                int i = stmt.executeUpdate();

                System.out.println(i + " record Updated");
            }
            // con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Shift.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(int id) {
        try {
            if (id != 0) {
                PreparedStatement stmt = conn.prepareStatement("delete from lms_student where id=?");

                stmt.setInt(1, id);

                int i = stmt.executeUpdate();
                System.out.println(i + " record Deleted");
            }
            // con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Shift.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Student> getList() {
        List<Student> list = new ArrayList<>();
        try {
            Student p;
            PreparedStatement stmt = conn.prepareStatement("select * from lms_student");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                p = new Student();
                p.setId(rs.getInt(1));
                p.setName(rs.getString(2));
                p.setRegistrationNo(rs.getInt(3));
                p.setBoardRollNo(rs.getInt(4));
                p.setClassRoll(rs.getInt(5));
                p.setDepartmentId(rs.getInt(6));
                p.setShiftId(rs.getInt(7));
                p.setHouseNo(rs.getString(8));
                p.setRoadNo(rs.getString(9));
                p.setBlockOrVillage(rs.getString(10));
                p.setThana(rs.getString(11));
                p.setDistrict(rs.getString(12));
                p.setDivision(rs.getString(13));
                p.setCountry(rs.getString(14));
                list.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Shift.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public Student getStudent(int id) {
        Student p = new Student();
        try {

            PreparedStatement stmt = conn.prepareStatement("select * from lms_student where id=?");
            stmt.setInt(1, id);

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                p.setId(rs.getInt(1));
                p.setName(rs.getString(2));
                p.setRegistrationNo(rs.getInt(3));
                p.setBoardRollNo(rs.getInt(4));
                p.setClassRoll(rs.getInt(5));
                p.setDepartmentId(rs.getInt(6));
                p.setShiftId(rs.getInt(7));
                p.setHouseNo(rs.getString(8));
                p.setRoadNo(rs.getString(9));
                p.setBlockOrVillage(rs.getString(10));
                p.setThana(rs.getString(11));
                p.setDistrict(rs.getString(12));
                p.setDivision(rs.getString(13));
                p.setCountry(rs.getString(14));

            }

        } catch (SQLException ex) {
            Logger.getLogger(Shift.class.getName()).log(Level.SEVERE, null, ex);
        }
        return p;
    }

    @Override
    public Student getUserByRegistrationNo(int registrationNo) {
        Student p = new Student();
        try {

            PreparedStatement stmt = conn.prepareStatement("select * from lms_student where registration_no=?");
            stmt.setInt(1, registrationNo);

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                p.setId(rs.getInt(1));
                p.setName(rs.getString(2));
                p.setRegistrationNo(rs.getInt(3));
                p.setBoardRollNo(rs.getInt(4));
                p.setClassRoll(rs.getInt(5));
                p.setDepartmentId(rs.getInt(6));
                p.setShiftId(rs.getInt(7));
                p.setHouseNo(rs.getString(8));
                p.setRoadNo(rs.getString(9));
                p.setBlockOrVillage(rs.getString(10));
                p.setThana(rs.getString(11));
                p.setDistrict(rs.getString(12));
                p.setDivision(rs.getString(13));
                p.setCountry(rs.getString(14));

            }

        } catch (SQLException ex) {
            Logger.getLogger(Shift.class.getName()).log(Level.SEVERE, null, ex);
        }
        return p;
    }

    @Override
    public Set<Student> getStudentList() {
         Set<Student> list = new HashSet<>();
        try {
            Student p;
            PreparedStatement stmt = conn.prepareStatement("select * from lms_student");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                p = new Student();
                p.setId(rs.getInt(1));
                p.setName(rs.getString(2));
               
                list.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

}
