package Lesson3.Abstract;

public abstract class Human {
    private String name;

    public String getName(){
        return name;
    }

    Human (String name ){
        this.name = name;
    }

    public abstract void display();

    //Extends - расширение абстрактного класса
    // Создайте абстрактный класс Person с полем name с геттером и конструктором
    //Создать в классе Person абстрактный метод display()
    //Создадим классы Employee и Client и добавим к ним поле String bank
    //Переопредлим метод display и для клиента и для сотрудника.
    //Для сотрудника:
    //Имя сотрудника: ... . Банк: ....
    //Для клиента
    //Имя клиента: ... . Банк: ....
}
