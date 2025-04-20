package org.example;

import org.example.config.appConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(appConfig.class);

        //By default, every bean will be singleton that means the moment you load your application it will create a container and in that container, the object will be available
//        Desktop dt = context.getBean("desktop1",Desktop.class);
//        dt.compile();
//
//        Desktop dt1 = context.getBean("desktop1",Desktop.class);
//        dt1.compile();

        // they are two reference variables for a single object.. because by default it is singleton

        // What if you want to create two different objects?
        // In that case, go to appConfig class and use scope(value = "prototype")

//        Desktop dt = context.getBean("desktop1",Desktop.class);
//        dt.compile();
//
//        Desktop dt1 = context.getBean("desktop1",Desktop.class);
//        dt1.compile();

        //How can we autowire?? Like if there is an object in a class that needs to be set or initialized

        Alien obj1 = context.getBean(Alien.class);
        obj1.code();



    }
}
