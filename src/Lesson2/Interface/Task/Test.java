package Lesson2.Interface.Task;

public class Test {

    //Тестирование статических и не статических классов
    public static void main(String[] args) {
        MyClass c1 = new MyClass();
        c1.secondMethod();

        MyClass.firstMethod();
    }
}
