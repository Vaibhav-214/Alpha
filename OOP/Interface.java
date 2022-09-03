package com.company.OOP;

public class Interface {
    public static void main(String[] args) {
    Queen q1 = new Queen();
    q1.moves();
    }
}

interface chessplayer {
    void moves();// this function by default is public and abstract
}
class Queen implements chessplayer {
    public void moves() {// we need to make this method public cause it is default type if we dont write anything
        // but our method moves is public by default because its from interface
        System.out.println("up,down,right,left,diagonal");
    }
}
class Rook implements chessplayer {
    public void moves() {
        System.out.println("up,down,right,left");
    }
}
class kind implements chessplayer {
    public void moves() {
        System.out.println("moves 1 step in all directions");
    }
}

// below from here is example of multiple inheritance
interface Herbivore {

}
interface Carnivore {

}
class Bear implements Herbivore, Carnivore {

}