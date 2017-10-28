package com.coderbd.lms.service;



import com.coderbd.lms.connection.DbConnection;
import com.coderbd.lms.dao.InstituteDao;
import com.coderbd.lms.domain.Institute;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anik
 */
public class InstituteService implements InstituteDao{

    Connection connect=DbConnection.getConnection();

    @Override
    public void save(Institute institute) {
     
        try {

            if (institute.getName() != null) {

                PreparedStatement stmt = connect.prepareStatement("INSERT INTO lms_institute(name,house_no,road_no,block_or_village,thana,district,division,country,address_type,institute_type ) values(?,?,?,?,?,?,?,?,?,?)");

                stmt.setString(1, institute.getName());
                stmt.setString(2, institute.getHouseNo());
                stmt.setString(3, institute.getRoadNo());
                stmt.setString(4, institute.getBlockOrVillage());
                stmt.setString(5, institute.getThana());
                stmt.setString(6, institute.getDistrict());
                stmt.setString(7, institute.getDivision());
                stmt.setString(8, institute.getCountry());
                stmt.setString(9, institute.getAddresstype());
                stmt.setString(10, institute.getInstituteType());

                stmt.executeUpdate();
            }

        } catch (SQLException e) {
            Logger.getLogger(InstituteService.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public void update(Institute institute) {
          try {

            if (institute.getId() != 0) {

                PreparedStatement statement = connect.prepareStatement("UPDATE  lms_institute SET name=?,house_no=?,road_no=?,block_or_village=?,thana=?,district=?,division=?,country=?,address_type=?,institute_type=? WHERE id=?");

                statement.setString(1, institute.getName());
                statement.setString(2, institute.getHouseNo());
                statement.setString(3, institute.getRoadNo());
                statement.setString(4, institute.getBlockOrVillage());
                statement.setString(5, institute.getThana());
                statement.setString(6, institute.getDistrict());
                statement.setString(7, institute.getDivision());
                statement.setString(8, institute.getCountry());
                statement.setString(9, institute.getAddresstype());
                statement.setString(10, institute.getInstituteType());
                statement.setInt(11, institute.getId());

                statement.executeUpdate();

            }

        } catch (SQLException e) {
            Logger.getLogger(InstituteService.class.getName()).log(Level.SEVERE, null, e);
        }

    }

    @Override
    public void delete(int id) {
     
        try {

            PreparedStatement statement = connect.prepareStatement("DELETE FROM lms_institute WHERE id=?");
            
            statement.setInt(1, id);
            statement.executeUpdate();
            
        } catch (SQLException e) {
            Logger.getLogger(InstituteService.class.getName()).log(Level.SEVERE, null, e);
        }

    }

    @Override
    public List<Institute> getList() {
      
        List<Institute> list = new ArrayList<>();
        
        try {

            PreparedStatement statement = connect.prepareStatement("SELECT * FROM lms_institute");
            ResultSet result = statement.executeQuery();

            Institute institute = new Institute();

            while (result.next()) {
                institute.setId(result.getInt(1));
                institute.setName(result.getString(2));
                institute.setHouseNo(result.getString(3));
                institute.setRoadNo(result.getString(4));
                institute.setBlockOrVillage(result.getString(5));
                institute.setThana(result.getString(6));
                institute.setDistrict(result.getString(7));
                institute.setDivision(result.getString(8));
                institute.setCountry(result.getString(9));
                institute.setAddresstype(result.getString(10));
                institute.setInstituteType(result.getString(11));
                
                list.add(institute);
                
            }

        } catch (SQLException e) {
            Logger.getLogger(InstituteService.class.getName()).log(Level.SEVERE, null, e);
        }
        return list;
    }

}
