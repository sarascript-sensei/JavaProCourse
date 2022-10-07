package Lesson3.Polymorfism;

public class Add {

    void sum(int x, int y){
        int z = x+y;
        System.out.println("Сумма двух чисел: " + z);
    }
    void sum(int x, int y, int i){
        int z = x+y+i;
        System.out.println("Сумма трех чисел: " + z);

    }
}
