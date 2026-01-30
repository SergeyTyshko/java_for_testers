package ru.stqa.geometry;

import ru.stqa.geometry.figures.Rectangle;
import ru.stqa.geometry.figures.Square;
import ru.stqa.geometry.figures.Triangle;

public class Geometry {
    public static void main(String[] args) {
        Square.printSquareArea(new Square(7.0));
        Square.printSquareArea(new Square(8.));
        Square.printSquareArea(new Square(1.));

        Rectangle.printRectangleArea(3.0, 5.0);
        Rectangle.printRectangleArea(7.0, 9.0);

        Triangle.printTrianglePerimeter(new Triangle(2.0, 2.0, 3.0));
        Triangle.printTrianglePerimeter(new Triangle(3.0, 4.0, 5.0));
        Triangle.printTrianglePerimeter(new Triangle(5.0, 6.0, 7.0));

        Triangle.printTriangleArea(new Triangle(2.0, 2.0, 2.0));
        Triangle.printTriangleArea(new Triangle(3.0, 4.0, 5.0));
        Triangle.printTriangleArea(new Triangle(4.0, 6.0, 7.9));

    }

}
