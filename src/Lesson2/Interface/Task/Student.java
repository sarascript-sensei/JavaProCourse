package Lesson2.Interface.Task;



/*
    //Наследование Student, Aspirant
    //Создайте пример наследования, реализуйте класс Student и класс Aspirant,
    // аспирант отличается от студента наличием некой научной работы.
    //Класс Student содержит переменные: String firstName, lastName, group.
    // А также, double averageMark, содержащую среднюю оценку.
    //Создать переменную типа Student, которая ссылается на объект типа Aspirant.
    //Создать метод getScholarship() для класса Student, который возвращает сумму стипендии.
    // Если средняя оценка студента равна 5, то сумма 100 грн, иначе 80.
    // Переопределить этот метод в классе Aspirant.
    // Если средняя оценка аспиранта равна 5, то сумма 200 грн, иначе 180.
    //Создать массив типа Student, содержащий объекты класса Student и Aspirant.
    // Вызвать метод getScholarship() для каждого элемента массива.

 */

//Student[] students = {new Student(3.0), new Aspirant(4.0)};


public class Student {


    String firstName;
    String lastName;
    String group;

    double averageMark;
    double scolarship;

    public Student(double averageMark){
        this.averageMark = averageMark;
    }

    public double getScolarship(){
        if(averageMark==5.0){
            scolarship = 100;
        }else {
            scolarship = 80;
        }
        return scolarship;
    }
}
