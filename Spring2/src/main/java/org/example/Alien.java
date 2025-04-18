package org.example;

public class Alien {

    private int age;
    private Laptop lap;

    public Alien()
    {
        System.out.println("Alien object created");
    }

    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        this.lap = lap;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Age setter called");
        this.age = age;
    }

    public void code()
    {
        System.out.println("Coding");
        lap.compile();
    }
}
