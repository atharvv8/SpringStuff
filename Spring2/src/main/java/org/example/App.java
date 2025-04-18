package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {

        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        Alien obj = (Alien) context.getBean("alien1");

        //We want to set a value to age parameter of alien class
        //Of course we can do that by using setter() method
        //But we can also do that by setter injection (dependency injection)
        //In config.xml file by using property attribute

        System.out.println(obj.getAge());
        //It prints the age

        //But does it call setter() method?? Let's find out

        //Yes it does

        //Age was a primitive variable... what if we want to work with reference variable
        //Let's create laptop's object in Alien class

        //We use ref attribute in property sub-tag in bean tag to wire them
        obj.code();

    }
}
