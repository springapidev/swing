package com.coderbd.lms.domain;

/**
 *
 * @author Rajaul Islam
 */
public class BookReceive {

    private int id;
    private int bookId;
    private int studentId;
    private String returnDate;
    private int qty;
    private String status;

    public BookReceive() {
    }

    public BookReceive(int bookId, int studentId, String returnDate, int qty, String status) {
        this.bookId = bookId;
        this.studentId = studentId;
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
