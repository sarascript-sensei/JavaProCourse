package Lesson2.Repeat;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("Круг с радиусом " + c1.getRadius() + " имеет площадь " + c1.getArea());

        Circle c2 = new Circle(2.0);
        System.out.println("Круг с радиусом " + c2.getRadius() + " имеет площадь " + c2.getArea());
    }
}
