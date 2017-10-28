package com.coderbd.lms.domain;

/**
 *
 * @author Rajail Islam
 */
public class BookSummary {

    private int id;
    private String bookCode;
    private String bookName;
    private int totalStock;
    private int avilableStock;
    private int alreadyLend;
    private int lostQty;

    public BookSummary() {
    }

    public BookSummary(String bookCode, String bookName, int totalStock, int avilableStock, int alreadyLend, int lostQty) {
        this.bookCode = bookCode;
        this.bookName = bookName;
        this.totalStock = totalStock;
        this.avilableStock = avilableStock;
        this.alreadyLend = alreadyLend;
        this.lostQty = lostQty;
    }

    public BookSummary(int totalStock, int avilableStock, int alreadyLend) {
        this.totalStock = totalStock;
        this.avilableStock = avilableStock;
        this.alreadyLend = alreadyLend;
    }

    public BookSummary(int totalStock, int avilableStock, int alreadyLend, int lostQty) {
        this.totalStock = totalStock;
        this.avilableStock = avilableStock;
        this.alreadyLend = alreadyLend;
        this.lostQty = lostQty;
    }

    public BookSummary(int totalStock, int avilableStock) {
        this.totalStock = totalStock;
        this.avilableStock = avilableStock;
    }

   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookCode() {
        return bookCode;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getTotalStock() {
        return totalStock;
    }

    public void setTotalStock(int totalStock) {
        this.totalStock = totalStock;
    }

    public int getAvilableStock() {
        return avilableStock;
    }

    public void setAvilableStock(int avilableStock) {
        this.avilableStock = avilableStock;
    }

    public int getAlreadyLend() {
        return alreadyLend;
    }

    public void setAlreadyLend(int alreadyLend) {
        this.alreadyLend = alreadyLend;
    }

    public int getLostQty() {
        return lostQty;
    }

    public void setLostQty(int lostQty) {
        this.lostQty = lostQty;
    }

  
}
