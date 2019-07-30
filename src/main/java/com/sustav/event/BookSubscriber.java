package com.sustav.event;

import com.sustav.bean.Book;

import javax.ejb.Singleton;
import javax.enterprise.event.Observes;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Anton Sustavov
 * @since 2019/07/30
 */
@Singleton
public class BookSubscriber {
    private List<Book> bookList = new ArrayList<>();

    public List<Book> getBookList() {
        return bookList;
    }

    public void add(@Observes Book book) {
        System.out.println(book.getName() + " add to list");
        bookList.add(book);
    }

    public List<Book> bookPrint() {
        return  bookList;
    }
}
