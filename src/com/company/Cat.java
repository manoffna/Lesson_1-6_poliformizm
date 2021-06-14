package com.company;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void run(int distance_r){
        if (distance_r <= 200 ) {
            System.out.println("Кот " + name + " пробежал " + distance_r + "м");
        } else System.out.println("Кот " + name + " сошёл с дистанции ");
    }

    @Override
    public void swim(int distance_sw){
        System.out.println("Кот " + name + " не умеет плавать");
    }
}
