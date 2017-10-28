package com.coderbd.lms.domain;


/**
 *
 * @author Rajaul Islam
 */
public class Student {

    private int id;
    private String name;
    private int registrationNo;
    private int boardRollNo;
    private int classRoll;
    private int departmentId;
    private int shiftId;
    private String houseNo;
    private String roadNo;
    private String blockOrVillage;
    private String thana;
    private String district;
    private String division;
    private String country;
   

    public Student() {
    }

    public Student(String name, int registrationNo, int boardRollNo, int classRoll, int departmentId, int shiftId, String houseNo, String roadNo, String blockOrVillage, String thana, String district, String division, String country) {
        this.name = name;
        this.registrationNo = registrationNo;
        this.boardRollNo = boardRollNo;
        this.classRoll = classRoll;
        this.departmentId = departmentId;
        this.shiftId = shiftId;
        this.houseNo = houseNo;
        this.roadNo = roadNo;
        this.blockOrVillage = blockOrVillage;
        this.thana = thana;
        this.district = district;
        this.division = division;
        this.country = country;
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

    public int getRegistrationNo() {
        return registrationNo;
    }

    public void setRegistrationNo(int registrationNo) {
        this.registrationNo = registrationNo;
    }

    public int getBoardRollNo() {
        return boardRollNo;
    }

    public void setBoardRollNo(int boardRollNo) {
        this.boardRollNo = boardRollNo;
    }

    public int getClassRoll() {
        return classRoll;
    }

    public void setClassRoll(int classRoll) {
        this.classRoll = classRoll;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public int getShiftId() {
        return shiftId;
    }

    public void setShiftId(int shiftId) {
        this.shiftId = shiftId;
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
    
    

}
