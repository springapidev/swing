/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.lms.domain;

import java.util.Date;

/**
 *
 * @author Rajaul Islam
 */
public class Book {

    private int id;
    private String name;
    private String bookCode;
    private String author;
    private String publisher;
    private String edition;
    private double unitPrice;
    private int qty;
    private double totalPrice;
    private String rackNo;
    private String issnNo;
    private String category;
    private Date purchaseDate;
    private boolean status;
    private Date createdDate;
    private String createdBy;

    public Book() {
    }

    public Book(String name, String bookCode, String author, String publisher, String edition, double unitPrice, int qty, double totalPrice, String rackNo, String issnNo, String category, Date purchaseDate, boolean status, Date createdDate, String createdBy) {
        this.name = name;
        this.bookCode = bookCode;
        this.author = author;
        this.publisher = publisher;
        this.edition = edition;
        this.unitPrice = unitPrice;
        this.qty = qty;
        this.totalPrice = totalPrice;
        this.rackNo = rackNo;
        this.issnNo = issnNo;
        this.category = category;
        this.purchaseDate = purchaseDate;
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

    public String getBookCode() {
        return bookCode;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getRackNo() {
        return rackNo;
    }

    public void setRackNo(String rackNo) {
        this.rackNo = rackNo;
    }

    public String getIssnNo() {
        return issnNo;
    }

    public void setIssnNo(String issnNo) {
        this.issnNo = issnNo;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
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
