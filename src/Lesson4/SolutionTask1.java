package Lesson4;

import java.util.Arrays;

public class SolutionTask1 {

        public static void main(String[] args) {
            int[] array1 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
            System.out.println(
                    Arrays.toString(insertElem(array1, 5, 3))
            );

        }
        private static int[] insertElem(int[] array, int elem, int position) {
            int[] newArray = new int[array.length + 1];
            newArray[position - 1] = elem;
            for (int i = 0; i < array.length; i++) {
                if (i < position-1) newArray[i] = array[i];
                else newArray[i+1] = array[i];
            }
            return newArray;
        }
    }
