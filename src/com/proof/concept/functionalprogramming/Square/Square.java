package com.proof.concept.functionalprogramming.Square;

public class Square {
    int sideLenght;

    public Square(int sideLenght) {
        this.sideLenght = sideLenght;
    }

    public int calculateArea() {
        return sideLenght * sideLenght;
    }
}
