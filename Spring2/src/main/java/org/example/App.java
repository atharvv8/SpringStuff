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
        //But we can also do that by setter injection (dependancy injection)
        //In config.xml file by using property attribute

        System.out.println(obj.getAge());
        //It prints the age

        //But does it call setter() method?? Let's find out

        //Yes it does



    }
}
