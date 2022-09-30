package Lesson1;

import Lesson1.Model.Box;
import Lesson1.Model.Cat;
import Lesson1.Model.Robot;

public class Demo {
    public static void main(String[] args) {
/*        Box box1 = new Box();
        box1.width = 20;
        box1.height = 30;
        box1.depth = 20;


        System.out.println(box1.getVolume(box1.width, box1.width, box1.height));

        Box box2 = new Box();

        box2.width = 10;
        box2.height = 15;
        box2.depth = 10;
        double value2 = box2.depth* box2.height* box2.width;
        System.out.println(value2);*/

/*        SimpleGetterSetter simpleGetterSetter = new SimpleGetterSetter();
        simpleGetterSetter.setNumber(5);
        simpleGetterSetter.setName("Vasya");
        System.out.println(simpleGetterSetter.getName());
        System.out.println(simpleGetterSetter.getNumber());

        Student student = new Student();
        student.setAge(10);
        */
        Robot robot = new Robot();

        robot.forward(20);
        robot.printCoordinates();

        robot.setCourse(90);
        robot.forward(20);
        robot.printCoordinates();


    }
}

// Создать класс Cat, с полями цвет, имя, порода. Создать отдельный метод, выводящий эти результаты.
// Создать на свое усмотрение 3 метода для кошки
// Создать 3 экземляра класса Cat


// Создать класс Student, с приватными полями name, age, courseGroup, averageMark.
// Создать геттеры и сеттеры
// Назначить правила для возраста и averageMark.




