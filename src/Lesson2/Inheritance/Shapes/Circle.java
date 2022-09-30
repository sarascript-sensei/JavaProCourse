package Lesson2.Inheritance.Shapes;

public class Circle extends Shape{
    private static final double PI = Math.PI;
    private double diameter;

    public Circle(double diameter){
        this.diameter = diameter;
    }

    public double area(){
        double radius = diameter / 2.0;
        return PI * radius * radius;
    }

}

//Создадим класс Rectangle. Переопределить метод area с родительского класса Shape, так
//чтобы вычилить площадь прямоугольника
//Формула : length * breadth (ширина*длина)
