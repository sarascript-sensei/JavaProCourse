package Lesson2.Interface.Task;

public class Aspirant extends Student{

    public Aspirant(double averageMark) {
        super(averageMark);
    } // Наследуем переменную с суперкласса с помощью super

    @Override
    public double getScolarship() {
        if(averageMark==5.0){
            scolarship = 200;
        }else {
            scolarship = 180;
        }
        return scolarship;
    }
}
