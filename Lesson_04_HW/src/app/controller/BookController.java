package app.controller;

import app.domain.Book;
import app.service.BookService;
import org.springframework.stereotype.Component;

@Component
public class BookController {

    private BookService service;

    public BookController(BookService service) {
        this.service = service;
    }

    public Book getById(Long id) {
        return service.getById(id);
    }

    public Book getByIsbn(String isbn) {
        return service.getByIsbn(isbn);
    }
}
