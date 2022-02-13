package com.company;

public class Main {

    public static void main(String[] args) {
        Animal[] arrays = {new Shark(), new Turtle(), new Eage()};

        for (Animal animal : arrays) {
            if (animal instanceof Shark) {
                ((Shark) animal).attack();
            } else if (animal instanceof Turtle) {
                ((Turtle) animal).swim();
            } else if (animal instanceof Eage) {
                ((Eage) animal).fly();
            }
        }
        Shark[] sharks = new Shark[arrays.length];
        Turtle[] turtles = new Turtle[arrays.length];
        Eage[] eages = new Eage[arrays.length];

        for (Animal i : arrays) {
            if (i instanceof Shark) {
             sharks[0] = new Shark();
            }else if (i instanceof Turtle){
                turtles[1] = new Turtle();
            }else if (i instanceof Eage){
                eages[2] = new Eage();
            }

            }
        }
    }
