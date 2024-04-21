package app.service;

import app.domain.Book;

public interface BookService {

    Book getById(Long id);
    Book getByIsbn(String isbn);
    void addBook(String title, String isbn);
}
