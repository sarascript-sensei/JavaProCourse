package Lesson2.Inheritance.Shapes;

import Lesson2.Inheritance.Box.HeavyBox;

public class Main {
    public static void main(String[] args) {
        Shape s1 = new Circle(5.0);
        Shape s2 = new Rectangle(5.0, 3.0);
        Shape larger = getLargerShape(s1,s2);
        System.out.println("Самая большая площадь " + larger.area());

        HeavyBox heavyBox = new HeavyBox(15, 20, 25, 6);
        System.out.println("Объем коробки: " + heavyBox.getVolume() + "\n Вес коробки: " + heavyBox.getWeight());
    }
    public static Shape getLargerShape(Shape s1, Shape s2){
        if(s1.area()>s2.area()){
            return s1;
        }else{
            return s2;
        }
    }
}
