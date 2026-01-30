package ru.stqa.geometry.figures;

public record Triangle (double a, double b, double c) {

    public static void printTrianglePerimeter(Triangle t) {
        String text = String.format("Периметр треугольника со сторонами %f и %f и %f = %f", t.a, t.b, t.c, t.perimeter());
        System.out.println(text);
    }

    public double perimeter() {
        return this.a + this.b + this.c;
    }

    public static void printTriangleArea(Triangle t) {
        String text = String.format("Площадь треугольника со сторонами %f и %f и %f = %f", t.a, t.b, t.c, t.area());
        System.out.println(text);
    }

    public double area() {
        double semiperimeter = ((a+b+c)/2);
        return Math.sqrt(semiperimeter*(semiperimeter-this.a)*(semiperimeter-this.b)*(semiperimeter-this.c));
    }
}
