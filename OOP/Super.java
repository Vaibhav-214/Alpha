package com.company.OOP;

public class Super {
    public static void main(String[] args) {
    Boruto b1 = new Boruto();
        System.out.println(b1.jutsu);

    }
}
class Naruto {
    String jutsu;
    Naruto(){
        System.out.println("Naruto class constructor is called");
    }
}
class Boruto extends Naruto {
    Boruto(){
        super();// super keyword will invoke constructor of immediate parent class
        // and this above line of code happens by default if we dont write it in java
        System.out.println("Boruto classs constructor is called");
        super.jutsu = "Shadow Clone";
    }
}
