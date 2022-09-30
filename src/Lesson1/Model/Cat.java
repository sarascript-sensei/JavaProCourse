package Lesson1.Model;

public class Cat {
    String name;
    int age;

   //Конструктор и мы его перезагрузили
    public Cat (String name, int age) {
        this.name = name;
        this.age = age;
    }

    //Конструктор
    public Cat(String name){
        this.name = name;
    }


    public static void main(String[] args) {

        Cat barsik = new Cat("Barsik", 3);
        Cat pushok = new Cat("Пушок");
        System.out.println("Имя кота: " + barsik.name + " Возраст кота: " + barsik.age);
        System.out.println("Имя кота: " + pushok.name);
    }
}
