package com.coderbd.lms.dao;

import com.coderbd.lms.domain.BookSummary;
import com.coderbd.lms.domain.User;
import java.util.List;

/**
 *
 * @author Rajaul Islam
 */
public interface BookSummaryDao {
     void saveWhenBookPurchase(BookSummary s);
   
    void update(BookSummary s);
     void updateWhenBookPurchase(BookSummary s);

    List<BookSummary> getList();

   public BookSummary getBookSummaryByBookCode(String bookCode);
    public BookSummary getBookSummaryById(int id);
}
