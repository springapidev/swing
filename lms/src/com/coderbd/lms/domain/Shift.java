package com.coderbd.lms.domain;

import java.util.Date;

/**
 *
 * @author Rajaul Islam
 */
public class Shift {

    private int id;
    private String name;
    private Date startingTime;
    private Date endingTime;
    private boolean status;
    private Date createdDate;
    private String createdBy;

    public Shift() {
    }

    public Shift(String name, Date startingTime, Date endingTime, boolean status, Date createdDate, String createdBy) {
        this.name = name;
        this.startingTime = startingTime;
        this.endingTime = endingTime;
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

    public Date getStartingTime() {
        return startingTime;
    }

    public void setStartingTime(Date startingTime) {
        this.startingTime = startingTime;
    }

    public Date getEndingTime() {
        return endingTime;
    }

    public void setEndingTime(Date endingTime) {
        this.endingTime = endingTime;
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
