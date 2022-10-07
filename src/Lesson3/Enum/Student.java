package Lesson3.Enum;

enum Student {
    //Перечисление Student: 4 студента
    DAN(14),
    MARK(15),
    EMIL(17);

    private int age;
    int getAge(){
        return age;
    }
    Student(int age){
        this.age = age;
    }
    Student(){

    }

    public static void main(String[] args) {
        Student S;
        System.out.println("Возраст Дэна " + Student.DAN.getAge() + " лет");
    }

    /*
     //Enum
    /*Создайте перечисление Days(monday, tuesday...)
    В Main Выведите "Мой любимый день недели" + название
     */

    /*
    1.Создайте перечисление Type, в котором будут 4 константы:
        SCIENCE,
    BELLETRE,
    PHANTASY,
    SCIENCE_FICTION
    2.Создайте класс Book с полями String name, Type bookType, String author и объявите конструктор
    3. Создайте экземляр класса Book
    4. В главном методе с помощью switch case выведите на консоль тип определенной книги (Например, case Science
    Вывод:
    Научная книга)
     */
}
