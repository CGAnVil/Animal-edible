package com.codegym;

public class Chicken extends Animal implements Edible {


    @Override
    String makeSound() {
        return "Chicken crows";
    }

    @Override
    public String howToEat() {
        return "Throw into a very hot pot of water";
    }
}
