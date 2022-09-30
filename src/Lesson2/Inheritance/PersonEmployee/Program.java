package Lesson2.Inheritance.PersonEmployee;

import Lesson2.Inheritance.PersonEmployee.Employee;
import Lesson2.Inheritance.PersonEmployee.Person;

public class Program {
    public static void main(String[] args) {
        Person tom = new Person("Tom", 23);
    tom.display();
    Employee sam = new Employee("Sam", "Microsoft");
    sam.display();


    }
}

//Передаем Employee в конструктор еще одну переменную (помимо родительской)
//Переопределяем метод display, добавив вывод компании:
//Пример:
//Имя: Том
//Компания: Microsoft




