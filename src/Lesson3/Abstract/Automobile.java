package Lesson3.Abstract;

abstract class Automobile {
    abstract void move();
    abstract void turn();
    abstract void brake();

    //Если нам нужно поведение - необходимо использовать интерфейс
    //Если речь идет о концептуальном объекте - используем абстрактный класс
}
