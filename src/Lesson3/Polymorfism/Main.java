package Lesson3.Polymorfism;

public class Main {
    public static void main(String[] args) {
        Forms forms = new Forms();
        Forms triangle = new Triang();
        Forms circle = new Circ();
        triangle.setName("Dan");
        forms.shapeArea();
        triangle.shapeArea();
        circle.shapeArea();

        Add myAdd = new Add();
        myAdd.sum(2,3,5);
    }
}
