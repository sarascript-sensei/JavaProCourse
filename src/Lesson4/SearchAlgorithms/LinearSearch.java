package Lesson4.SearchAlgorithms;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int counter, i, target, array[];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размера массива: ");
        i = scanner.nextInt();
        array = new int[i];
        System.out.println("Введите " + i + " элементов массива");

        for (counter=0; counter< i; counter++){
            array[counter] = scanner.nextInt();
        }
        System.out.println("Введите число для поиска: ");
        target = scanner.nextInt();

        for(counter=0; counter<i; counter++){
            if(array[counter]== target){
                System.out.println(target + " является " + (counter+1) + " по счету элементом массива");
                break;
            }
        }
        if (counter==i){
            System.out.println(target + " не найдено");
        }
    }
}
