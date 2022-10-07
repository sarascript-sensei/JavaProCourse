package Lesson4.WorkWithArrays;
import java.util.Arrays;
import java.util.Collections;

public class ArraysVoids {
    public static void main(String[] args) {
        Integer [] arr = {4,21,1,45,23,2};
        Arrays.sort(arr, Collections.reverseOrder());//Сортировка массива по убыванию
/*        Arrays.sort(arr);//Сортировка массива по возрастанию*/

        for (int values: arr) {
            System.out.print(values + ", ");

        }
    }
}
