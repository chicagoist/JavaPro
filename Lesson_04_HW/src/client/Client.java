package client;

import app.controller.BookController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Client {
    public static void main(String[] args) {

        AbstractApplicationContext context =
                new AnnotationConfigApplicationContext("app");

        BookController controller = context.getBean(BookController.class);
        //System.out.println();
        System.out.println(controller.getById(2l));
        System.out.println();
        System.out.println(controller.getByIsbn("4786423463"));





    }
}
