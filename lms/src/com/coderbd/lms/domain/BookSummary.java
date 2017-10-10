package com.coderbd.lms.domain;

/**
 *
 * @author Rajail Islam
 */
public class BookSummary {

    private int id;
    private int bookId;
    private String bookName;
    private int totalStock;
    private int avilableStock;
    private int alreadyLend;
    private int lostQty;

    public BookSummary() {
    }

    public BookSummary(int bookId, String bookName, int totalStock, int avilableStock, int alreadyLend, int lostQty) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.totalStock = totalStock;
        this.avilableStock = avilableStock;
        this.alreadyLend = alreadyLend;
        this.lostQty = lostQty;
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
