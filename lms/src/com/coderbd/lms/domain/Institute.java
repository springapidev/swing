package com.coderbd.lms.domain;

import java.util.Date;

/**
 *
 * @author Rajaul Islam
 */
public class Institute {

    private int id;
    private String name;
    private String houseNo;
    private String roadNo;
    private String blockOrVillage;
    private String thana;
    private String district;
    private String division;
    private String country;
    private String addresstype;
    private String instituteType;

    public Institute() {
    }

    public Institute(String name, String houseNo, String roadNo, String blockOrVillage, String thana, String district, String division, String country, String addresstype, String instituteType) {
        this.name = name;
        this.houseNo = houseNo;
        this.roadNo = roadNo;
        this.blockOrVillage = blockOrVillage;
        this.thana = thana;
        this.district = district;
        this.division = division;
        this.country = country;
        this.addresstype = addresstype;
        this.instituteType = instituteType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    public String getRoadNo() {
        return roadNo;
    }

    public void setRoadNo(String roadNo) {
        this.roadNo = roadNo;
    }

    public String getBlockOrVillage() {
        return blockOrVillage;
    }

    public void setBlockOrVillage(String blockOrVillage) {
        this.blockOrVillage = blockOrVillage;
    }

    public String getThana() {
        return thana;
    }

    public void setThana(String thana) {
        this.thana = thana;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddresstype() {
        return addresstype;
    }

    public void setAddresstype(String addresstype) {
        this.addresstype = addresstype;
    }

    public String getInstituteType() {
        return instituteType;
    }

    public void setInstituteType(String instituteType) {
        this.instituteType = instituteType;
    }
   

   
}
