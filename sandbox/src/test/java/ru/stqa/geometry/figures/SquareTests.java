package ru.stqa.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquareTests {

    @Test
    void canCalculateArea () { //проверяем правильно ли вычисляется площадь квадрата
        var s = new Square(4.0);
        double result = s.area();
        Assertions.assertEquals(25.0, result);
    }

    @Test
    void canCalculatePerimeter() { // проверяем периметр
        var s = new Square(5.0);
        double result = s.perimeter();
        Assertions.assertEquals(20.0, result);
    }

    @Test
    void cannotCreateSquareWithNegativeSide() {//проверяем невозможность создания квадрата с отрицательной стороной
      try {
          new Square(-5.0);
          Assertions.fail();
      } catch (IllegalArgumentException exception) {

      }
    }

    @Test
    void testEquality() {
        var s1 = new Square(5.0);
        var s2 = new Square(4.0);
        Assertions.assertNotEquals(s1, s2);

    }

    @Test
    void testFail() {
        var s1 = new Square(5.0);
        var s2 = new Square(5.0);
        Assertions.assertTrue(s1.equals(s2));

    }
}
