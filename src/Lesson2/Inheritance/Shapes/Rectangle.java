package Lesson2.Inheritance.Shapes;

public class Rectangle  extends Shape {
    private double lenght;
    private double breadth;

    public Rectangle(double lenght, double breadth) {
        this.lenght = lenght;
        this.breadth = breadth;
    }

    @Override
    public double area(){
        return lenght * breadth;
    }


}
