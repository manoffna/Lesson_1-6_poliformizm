package com.company;

public abstract class Animal {
    String name;
    private int distance_r;
    private int distance_sw;

    public Animal(String name){
        this.name = name;
    }

    public void run(int distance_r){
        this.distance_r = distance_r;
        System.out.println();
    }

    public void swim(int distance_sw){
        this.distance_sw = distance_sw;
        System.out.println();
    }
}
