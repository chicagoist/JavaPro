package app.domain;

import java.util.Locale;
import java.util.Objects;

public class Book {

    private Long id;
    private String title;
    private String isbn10;

/*

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn10() {
        return isbn10;
    }

    public void setIsbn10(String isbn10) {
        this.isbn10 = isbn10;
    }
*/

    public Book(Long id, String title, String isbn10) {
        this.id = id;
        this.title = title;
        this.isbn10 = isbn10;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(id, book.id) && Objects.equals(title, book.title) && Objects.equals(isbn10, book.isbn10);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, isbn10);
    }

    @Override
    public String toString() {
        return String.format(Locale.US, "Book id: %d, title: %s, " +
                "ISBN10 - %s", id,title,isbn10);
    }


}
