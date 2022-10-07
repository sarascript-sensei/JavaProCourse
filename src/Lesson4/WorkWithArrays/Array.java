package Lesson4.WorkWithArrays;

public class Array {
    public static void main(String[] args) {
        /*int [] nums;*/
        int [] nums = new int[3];
        //Массив из городов: Чили, Лондон, Берлин.
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 4;

        System.out.println(nums[2]);
        System.out.println(nums.length);

        int[] num1 = new int[] {0,1,2,3,4,5};

        int[][] nums2 = {{0,1,2}, {3,4,5}}; // 0,1,2
                                            // 3,4,5
        int[] [] nums2_new = new int[2][3];

        //for( тип_данных имя_переменной : контейнер){
        //действия
        for(int i : num1){
            System.out.println(i);
        }
        for(int j = 0; j<num1.length; j++){
            System.out.println(j);
        }
    }
}
