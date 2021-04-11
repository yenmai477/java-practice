package app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
@SpringBootApplication

public class App {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(App.class, args);
        Test test = context.getBean(Test.class);
        System.out.println(test.getName());

    }
}