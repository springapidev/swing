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
    private Date issueDate;
    private Date expireDate;
    private Date returnDate;
    private int qty;
    private boolean status;

    public BookIssue() {
    }

    public BookIssue(int bookId, int studentId, Date issueDate, Date expireDate, Date returnDate, int qty, boolean status) {
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

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
