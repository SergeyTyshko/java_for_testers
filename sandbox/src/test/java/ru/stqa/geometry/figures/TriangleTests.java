package ru.stqa.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTests {

    @Test
    void canCalculateArea () { //проверяем правильно ли вычисляется площадь треугольника
        var firstTriangle = new Triangle(2.0, 2.0, 2.0);
        double firstResult = firstTriangle.area();
        var secondTriangle = new Triangle(3.0, 4.0, 5.0);
        double secondResult = secondTriangle.area();
        var thirdTriangle = new Triangle(4.0, 6.0, 7.9);
        double thirdResult = thirdTriangle.area();
        Assertions.assertEquals(1.7320508075688772, firstResult);
        Assertions.assertEquals(6.0, secondResult);
        Assertions.assertEquals(11.714392589887014, thirdResult);
    }

    @Test
    void canCalculatePerimeter() { // проверяем периметр
        var firstTriangle = new Triangle(2.0, 2.0, 3.0);
        double firstResult = firstTriangle.perimeter();
        var secondTriangle = new Triangle(3.0, 4.0, 5.0);
        double secondResult = secondTriangle.perimeter();
        var thirdTriangle = new Triangle(5.0, 6.0, 7.0);
        double thirdResult = thirdTriangle.perimeter();
        Assertions.assertEquals(7.0, firstResult);
        Assertions.assertEquals(12.0, secondResult);
        Assertions.assertEquals(18.0, thirdResult);

    }

    @Test
    void cannotCreateTriangleleWithNegativeSide() {//проверяем невозможность создания треугольника с отрицательными сторонами
        try {
            new Triangle(-2.0, 2.0, 3.0);
            Assertions.fail();
        } catch (IllegalArgumentException exception) {

        }
    }

    @Test
    void cannotCreateTriangleleWithInequality() {//проверяем невозможность создания треугольника с нарушением неравенства
        try {
            new Triangle(1.0, 3.0, 4.0);
            Assertions.fail();
        } catch (IllegalArgumentException exception) {

        }
    }

}
