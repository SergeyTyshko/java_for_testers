package ru.stqa.geometry;

import ru.stqa.geometry.figures.Rectangle;
import ru.stqa.geometry.figures.Square;
import ru.stqa.geometry.figures.Triangle;

public class Geometry {
    public static void main(String[] args) {
        Square.printSquareArea(7.);
        Square.printSquareArea(8.);
        Square.printSquareArea(1.);

        Rectangle.printRectangleArea(3.0, 5.0);
        Rectangle.printRectangleArea(7.0, 9.0);

        Triangle.printTrianglePerimeter(2.0, 2.0, 3.0);
        Triangle.printTrianglePerimeter(3.0, 4.0, 5.0);
        Triangle.printTrianglePerimeter(5.0, 6.0, 7.0);

        Triangle.printTriangleArea(2.0, 4.12, 5.0);
        Triangle.printTriangleArea(3.0, 4.0, 5.0);
        Triangle.printTriangleArea(4.0, 6.0, 7.9);

    }

}
