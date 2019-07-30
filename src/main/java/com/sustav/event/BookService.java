package com.sustav.event;

import com.sustav.bean.Book;

import javax.enterprise.event.Event;
import javax.inject.Inject;

/**
 * @author Anton Sustavov
 * @since 2019/07/30
 */
public class BookService {
    @Inject
    private Event<Book> bookEvent;

    public void addBook(Book book) {
        System.out.println(book.getName() + " book was added");
        bookEvent.fire(book);
    }
}
