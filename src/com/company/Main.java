package com.company;

public class Main {

    public static void main(String[] args) {
       Animal[] animal = new Animal[5];
       animal[0] = new Cat("Murzik");
       animal[1] = new Dog("Bobik");
       animal[2] = new Cat("Barsik");
       animal[3] = new Dog("Masha");
       animal[4] = new Cat("Murka");

       for (int i = 0; i < 5; i++) {
            if (animal[i] instanceof Cat) {
                ((Cat) animal[i]).run(700);
                ((Cat) animal[i]).swim(20);
            }

            if (animal[i] instanceof Dog) {
                ((Dog) animal[i]).run(700);
                ((Dog) animal[i]).swim(20);
            }
        }
    }
}
