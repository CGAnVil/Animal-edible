package com.codegym;

public class AbstractAndInterfaceTest {
    public static void main(String[] args) {
        Animal[] animal = new Animal[2];
        animal[0] = new Tiger();
        animal[1] = new Chicken();
        for (int i = 0; i < animal.length; i++) {
            System.out.println(animal[i].makeSound());

            if(animal[i] instanceof Chicken){
                Edible edibler = (Chicken) animal[i];
                System.out.println(edibler.howToEat());
            }
        }
        Fruits[] fruits = new Fruits[2];
        fruits[0] = new Apple();
        fruits[1]= new Orange();
        for (Fruits fruit: fruits
             ) {
            System.out.println(fruit.howToEat());
        }
    }
}
