package com.coderbd.lms.domain;

import java.util.Date;

/**
 *
 * @author Rajaul Islam
 */
public class BookIssue {

    private int id;
    private int bookId;
    private int studentId;
    private String issueDate;
    private String expireDate;
    private String returnDate;
    private int qty;
    private String status;

    public BookIssue() {
    }

    public BookIssue(int bookId, int studentId, String issueDate, String expireDate, String returnDate, int qty, String status) {
        this.bookId = bookId;
        this.studentId = studentId;
        this.issueDate = issueDate;
        this.expireDate = expireDate;
        this.returnDate = returnDate;
        this.qty = qty;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

   

   
}
