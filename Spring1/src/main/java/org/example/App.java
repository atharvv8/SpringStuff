package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {

        //Creating context with help of xml
        //Create "resources" folder in "main" directory
        //Create "config.xml" (or any name) file and define a=ml configuration for beans... you can copy from internet

        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml"); //If we observe carefully, object(or bean) that is specifies in bean tag in config.xml file gets created HERE even before using getBean().. this will happen when the scope is singleton which is default
        //If scope is prototype then object will be created only when getBean() is called



        Alien obj1 = (Alien) context.getBean("alien1");
        obj1.age = 21;
        System.out.println(obj1.age);
//        obj1.code();

        Alien obj2 = (Alien) context.getBean("alien1");
        System.out.println(obj2.age);
//        obj2.code(); //Will these lines create two objects??

        //It depends on what are we passing in getBean().. if we have created different bean tags in config.xml it will refer to different objects
        //If we are passing same bean id in getBean() then it will refer to same object


        //What if we want to create new object everytime we call getBean()
        //For that we have to use something called as scope... it is a property in bean tag in config.xml
        //By default scope is scope = "singleton"
        //If you want to create new object everytime you use getBean().. you can use scope = "prototype"



    }
}
