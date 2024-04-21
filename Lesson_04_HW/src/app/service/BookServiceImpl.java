package app.service;

import app.domain.Book;
import app.repository.BookRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

@Service
@PropertySource("classpath:application.properties")
public class BookServiceImpl implements BookService {

    private String articlePrefix;
    private BookRepository repository;


    public BookServiceImpl(
            @Value("${article.prefix}") String articlePrefix,
            @Qualifier("bookRepositoryImplFile") BookRepository repository) {
        this.articlePrefix = articlePrefix;
        this.repository = repository;
    }

    @Override
    public Book getById(Long id) {
        Book book = repository.getById(id);
        setArticle(book);
        return book;
    }

    @Override
    public Book getByIsbn(String isbn) {
        Book book = repository.getByIsbn(isbn);
        setArticle(book);
        return book;
    }

    @Override
    public void addBook(String title, String isbn) {
        repository.addBook(title,isbn);
    }

    @Override
    public void setArticle(Book book) {
        String article = String.format("%s-%C-%d",
                articlePrefix, book.getTitle().charAt(0), book.getId());
        book.setArticle(article);

    }
}
