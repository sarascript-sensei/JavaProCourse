package Lesson3.Enum;

public enum Colors {
    BLACK,
    RED,
    PINK;

    public static void main(String[] args) {
/*        Colors c;
        Colors cArray[] = Colors.values(); //позволяет получить массив всех значений Enum
        for(Colors a : cArray){
            System.out.println(a);
            c=Colors.valueOf("RED"); // Позволяет получить значения перечисления по его строковму значению
            System.out.println("I like " + c);*/
            System.out.println(Colors.RED.name()); //позволяет получить имя
            System.out.println(Colors.RED.ordinal()); //позволяет получить порядковый номер
            boolean isEqualstoItself = Colors.RED.equals(Colors.RED); // позволяет сравнить два перечисления
            boolean isEqualsToDifferentColor = Colors.RED.equals(Colors.BLACK);
        System.out.println(isEqualstoItself);
        System.out.println(isEqualsToDifferentColor);


        }
    }


    //Задания на практику
/*
Времена года
Создать перечисление, содержащее названия времен года.
Создать переменную содержащую ваше любимое время года и распечатать всю информацию о нем.
Создать метод, который принимает на вход переменную созданного вами enum типа. Если значение равно Лето, выводим на консоль “Я люблю лето” и так далее.
Используем оператор switch.
Перечисление должно содержать переменную, содержащую среднюю температуру в каждом времени года.
Добавить конструктор принимающий на вход среднюю температуру.
Создать метод getDescription, возвращающий строку “Холодное время года”.
Переопределить метод getDescription - для константы Лето метод должен возвращать “Теплое время года”.
В цикле распечатать все времена года, среднюю температуру и описание времени года.
 */


/*
Одежда
Создать перечисление, содержащее размеры одежды (XXS, XS, S, M, L).
Перечисление содержит метод getDescription, возвращающий строку "Взрослый размер".
Переопределить метод getDescription - для константы XXS метод должен возвращать строку “Детский размер”.
 Также перечисление должно содержать числовое значение euroSize(32, 34, 36, 38, 40),
 соответствующее каждому размеру. Создать конструктор, принимающий на вход euroSize.
Создать интерфейсы "Мужская Одежда" с методом "одетьМужчину" и "Женская Одежда" с методом "одетьЖенщину".
Создать абстрактный класс Одежда, содержащий переменные - размер одежды, стоимость, цвет.
Создать классы наследники Одежды - Футболка (реализует интерфейсы "Мужская Одежда" и "Женская Одежда"),
Штаны (реализует интерфейсы "Мужская Одежда" и "Женская Одежда"), Юбка (реализует интерфейсы "Женская Одежда"),
Галстук (реализует интерфейсы "Мужская Одежда").
Создать массив, содержащий все типы одежды. Создать класс Ателье, содержащий методы одетьЖенщину, одетьМужчину,
на вход которых будет поступать массив, содержащий все типы одежды. Метод одетьЖенщину выводит на консоль всю информацию о женской одежде.
То же самое для метода одетьМужчину.
 */
