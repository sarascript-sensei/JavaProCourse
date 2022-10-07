package Lesson4.Random;

import java.util.Random;

public class Math1 {
    public static void main(String[] args) {
/*        double a = Math.random();// [0,1]
        System.out.println(a);
        int b = (int) (Math.random()*3); //[0,3]
        //нижняя граница 0 -> 0*3 = 0
        //верхняя граница 3 -> 1 * 3;
        System.out.println(b);
        // Сгенерировать числа в диапозоне [0,100]*/

        int n = 5;
        for(int i = 0; i<10; i++){
            System.out.println(generateRandomNumber(n));
        }

    }

    public static double generateRandomNumber(double n){
        if(n<0){
            throw new IllegalArgumentException("n must not be negative");
        }
        return new Random().nextDouble(n+1); //0,1,2,3,4,5
    }
}
