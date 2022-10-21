package Lesson6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListRepeat {
    //Создать ArrayList и заполнить его
    //Посчитать сумму/умножение и вычитание всех элементов и вывести через функцию
    // Использовать add, get, remove функции

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(100));
        }
        System.out.println(list);

        listSum(list);
        listMultiply(list);
        listMinus(list);

    }

    public static void listSum(List<Integer> list){
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum+= list.get(i);
        }
        System.out.println(sum);
    }

    public static void listMultiply(List<Integer> list){
        int sum = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            sum*= list.get(i);
        }
        System.out.println(sum);
    }
    public static void listMinus(List<Integer> list){
        int sum = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            sum-= list.get(i);
        }
        System.out.println(sum);
    }

}
