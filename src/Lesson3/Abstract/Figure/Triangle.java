package Lesson3.Abstract.Figure;

public class Triangle extends Figure{
    double a, b, c;

    public Triangle(double a, double b, double c) {
        name = "Triangle";
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public void showName() {
        System.out.println("Треугольник");
    }


    @Override
    public double getArea() {
        if (((a + b) < c) || ((b + c) < a) || ((a + b) < b))
            return 0.0;
        double p = (a + b + c) / 2; //полупериметр
            double s;
            s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            return s;
    }
}
