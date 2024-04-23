package app.repository;

import app.domain.Book;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

@Repository
@Primary
public class BookRepositoryImplFile implements BookRepository {

    private String articlePrefix;

    public BookRepositoryImplFile(
            @Value("${article.prefix}") String articlePrefix) {
        this.articlePrefix = articlePrefix;
    }

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

    public Book addBook(String title, String isbn) {

        try {
            BufferedReader reader = new BufferedReader(new FileReader(
                    "src/database.txt"));

            BufferedWriter writer = new BufferedWriter(new FileWriter(
                    "src/database.txt", true));
            String line;
            Long lastId = 0L;

            while((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                lastId = Long.parseLong(parts[0]);
            }
            reader.close();

            Long newId = lastId + 1;
            boolean isbnExists = false;

            reader = new BufferedReader(new FileReader(
                    "src/database.txt"));

            while((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                if(parts.length >= 3 && parts[2].equals(isbn)) {
                    isbnExists = true;
                    break;
                }
            }
            reader.close();


            if(!isbnExists) {

                writer.newLine();
                writer.write(newId + ";" + title + ";" + isbn + ";" + articlePrefix);
                writer.close();
                System.out.println("Новая книга с ISBN " + isbn + " успешно " +
                        "добавлена в БД");
            } else {
                System.out.println("Такая книга с ISBN " + isbn + " уже " +
                        "существует в БД");
            }
        } catch(Exception e) {
            throw new RuntimeException(e);
        }

        return null;
    }
}
