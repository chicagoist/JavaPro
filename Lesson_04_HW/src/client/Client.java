package client;

import app.controller.BookController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Client {
    public static void main(String[] args) {

        AbstractApplicationContext context =
                new AnnotationConfigApplicationContext("app");

        BookController controller = context.getBean(BookController.class);

        System.out.println(controller.getById(2l));
        System.out.println();
        System.out.println(controller.getByIsbn("4786423463"));

        System.out.println();
        controller.addBook("Book4","1234567899");
        controller.addBook("Book4","1234567811");
    }
}

/* OUTPUT

Book id: 2, title: Book2, ISBN10 - 3456781239

Book id: 3, title: Book3, ISBN10 - 4786423463

Такая книга с ISBN 1234567899 уже существует в БД
Новая книга с ISBN 1234567811 успешно добавлена в БД

Process finished with exit code 0
*/