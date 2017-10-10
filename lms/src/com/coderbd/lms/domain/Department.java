package com.coderbd.lms.domain;

import java.util.Date;

/**
 *
 * @author Rajaul Islam
 */
public class Department {

    private int id;
    private String name;
     private String depCodeNo;
    private boolean status;
    private Date createdDate;
    private String createdBy;

    public Department() {
    }

    public Department(String name, String depCodeNo, boolean status, Date createdDate, String createdBy) {
        this.name = name;
        this.depCodeNo = depCodeNo;
        this.status = status;
        this.createdDate = createdDate;
        this.createdBy = createdBy;
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

    public String getDepCodeNo() {
        return depCodeNo;
    }

    public void setDepCodeNo(String depCodeNo) {
        this.depCodeNo = depCodeNo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
    
    
}
