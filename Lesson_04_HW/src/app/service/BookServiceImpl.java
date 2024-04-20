package app.service;

import app.domain.Book;
import app.repository.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    private BookRepository repository;


    public BookServiceImpl(BookRepository repository) {
        this.repository = repository;
    }

    @Override
    public Book getById(Long id) {
        Book book =repository.getById(id);
        return book;
    }

    @Override
    public Book getByIsbn(String isbn) {
        Book book = repository.getByIsbn(isbn);
        return book;
    }
}
