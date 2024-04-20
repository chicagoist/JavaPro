package app.repository;

import app.domain.Book;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.io.BufferedReader;
import java.io.FileReader;

@Repository
@Primary
public class BookRepositoryImplFile implements BookRepository {


    @Override
    public Book getById(Long id) {
        try(BufferedReader reader = new BufferedReader(new FileReader(
                "src/database.txt"))) {

            return reader.lines()
                    .filter(x -> x.split(";")[0].equals(id.toString()))
                    .limit(1)
                    .map(x -> {
                        String[] values = x.split(";");
                        return new Book(id, values[1], values[2]);
                    })
                    .findFirst()
                    .orElse(null);
        } catch(Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Book getByIsbn(String isbn) {
        try(BufferedReader reader = new BufferedReader(new FileReader(
                "src/database.txt"))) {

            return reader.lines()
                    .filter(x -> x.split(";")[2].equals(isbn))
                    .limit(1)
                    .map(x -> {
                        String[] values = x.split(";");
                        Long id = Long.parseLong(values[0]);
                        return new Book(id, values[1], values[2]);
                    })
                    .findFirst()
                    .orElse(null);
        } catch(Exception e) {
            throw new RuntimeException(e);
        }
    }
}
