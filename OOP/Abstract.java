package com.company.OOP;

public class Abstract {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.eat();
        h1.walk();
        Chicken c1 = new Chicken();
        c1.eat();
        c1.walk();
        //Animal a1 = new Animal();
        // above line will give an error cause we cannot create an object of an abstract class

        System.out.println(h1.skincolor);
        System.out.println(c1.skincolor);
        h1.changecolor("Black");
        c1.changecolor("Ornage");
        System.out.println(h1.skincolor);
        System.out.println(c1.skincolor);
    }
}
abstract class Animal {
    String skincolor;
    Animal() {//Constructor of an abstract class will make sure that every object created initially has brown as skincolor
        skincolor = "brown";
    }
    void eat(){
        System.out.println("An animal eats");
    }
    abstract void walk();//abstract methods cannot have a body
}

class Horse extends Animal {
    void walk() {// derived class should have body of abstract methods in parent class
        System.out.println("Horse walks on 4 legs");
    }
    void changecolor(String color) {
        this.skincolor = color;
    }
}
class Chicken extends Animal {
    void walk() {
        System.out.println("Chickens walk on 2 legs");
    }
    void changecolor(String color) {
        this.skincolor = color;
    }
}
