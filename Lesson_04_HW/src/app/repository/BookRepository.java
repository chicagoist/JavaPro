package app.repository;

import app.domain.Book;

public interface BookRepository {
    Book getById(Long id);
    Book getByIsbn(String isbn);
    Book addBook(String title, String isbn);
}
