package Lesson1;

public class Repeat {
    public static int minValue(int a, int b){
        return a <= b? a : b;
    }

    public static int minValueTwo(int a, int b){
        if(a>b){
            return b;
        }else{
            return a;
        }
    }

    public static boolean isEven(int a) {
        return a % 2 == 0;
    }

    public static int cube(int a){
        return (int) Math.pow(a, 3);
    }



    public static void main(String[] args) {
        System.out.println(minValue(2,5));
        System.out.println(minValueTwo(7,4));
        System.out.println(isEven(2));
        System.out.println(isEven(3));
        System.out.println(cube(5));
    }
}

    /*Напишите метод, который бы проверял, делится ли число на 2 без остатка или нет. Например,

если число 4, тогда метод должен возвращать true
если число 5, тогда метод должен возвращать false
если число 6, тогда метод должен возвращать true
и т.д.*/

/*Напишите метод, с помощью которого можно было бы возводить число в куб.*/
