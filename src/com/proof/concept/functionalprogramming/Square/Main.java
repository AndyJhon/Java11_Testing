package com.proof.concept.functionalprogramming.Square;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(4);
        Shapes shapes = (Square s) -> {
          return s.calculateArea();
        };
        System.out.println(shapes.getArea(square));

        Square square1 = new Square(4);
        Shapes shapes1 = Square::calculateArea;
        System.out.println(shapes.getArea(square));
    }
}
