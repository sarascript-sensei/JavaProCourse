package Lesson4.Random;

public class Random1 {
    public static void main(String[] args) {
        double [] arr = new double[10];
        for(int i = 0; i<arr.length; i++){
            arr[i] = (Math.random()*10);
            //Как можно сгенерировать только нечетные числа в диапозоне от 0 до 10?
            System.out.println("arr[" + i + "] = " + arr[i]);
            // ArrayList и его методы
            //LinkedList и его методы
            // Разница между ArrayList и LinkedList
        }
    }
}
