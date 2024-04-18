package client;

import app.controller.ProductController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Client {
    public static void main(String[] args) {

        AbstractApplicationContext context =
                new AnnotationConfigApplicationContext("app");

        ProductController controller = context.getBean(ProductController.class);
        //System.out.println();
        System.out.println(controller.getById(2l));

    }
}
