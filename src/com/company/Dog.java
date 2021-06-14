package com.company;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void run(int distance_r){
        if (distance_r <= 500 ) {
            System.out.println("Собака " + name + " пробежал " + distance_r + "м");
        } else System.out.println("Собака " + name + " сошла с дистанции ");
    }

    @Override
    public void swim(int distance_sw){
        if (distance_sw <= 10 ) {
            System.out.println("Собака " + name + " проплыла " + distance_sw + "м");
        } else System.out.println("Собака " + name + " сошла с дистанции ");
    }
}
