package Lesson4.SearchAlgorithms;


    //int []nums = {2,3,4,51,2,3,4,65,21} -> линейный поиск
    //elem = 65
    //1. Сравнить каждый элемент с искомым элементом
    // if(elem==nums[i]){
    // return i}

    //int [] nums2 = {1,2,3,4,5,6,7,8,9,10,11} -> двоичный поиск
    //elem =  10
    //1. Найти средний элемент массива
    //2. Если элемент для поиска больше чем средний элемент -> мы ищем в правой части
    //3. Если элемент для поиска меньше чем средний элемент -> мы ищем в левой части

    //Реализуйте эти два алгоритма (линейный и двоичный поиск) на своё усмотрение
    // (Если не изучали эти алгоритмы, напишите плюс личным сообщением)



public class LinearAndBinarySearch {
    public static void main(String[] args) {
        int[] arr = {4,24,1,45,23,2};
        System.out.println(linearSearch(arr, 23));
        System.out.println(binarySearch(arr, 23));

    }

    public static int linearSearch(int[] array, int toFind){
        for (int i = 0; i < array.length; i++) {
            if (toFind == array[i]){
                return i;
            }
        } return -1;
    }

    public static int binarySearch(int[] array, int toFind){
        return binSearch(array, toFind, 0, array.length-1);
    }

    public static int binSearch(int[] array, int toFind, int from, int to){
        if (from <= to){
            int mid = (from+to) / 2;
            if (toFind == array[mid]){
                return mid;
            }
            if (toFind > mid){
                return binSearch(array, toFind, mid + 1, to);
            }
            if (toFind < mid){
                return binSearch(array, toFind, from, mid-1);
            }
        }
        return -1;

    }
}
