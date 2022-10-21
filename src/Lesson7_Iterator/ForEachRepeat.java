package Lesson7_Iterator;

public class ForEachRepeat {

    public static void printAllGrardes(int[] grades){
        System.out.println("|");

        for(int num : grades){
            System.out.println(num + "|");
        }
        System.out.println();
    }

    public static double minGrade(int[] numbers){
        int minGrade = numbers[0];

        for(int num : numbers){
            if (num<minGrade){
                minGrade = num;
            }
        }
        return minGrade;
    }

    public static double averageGrade(int[] numbers){
        int sum = 0;
        for(int num : numbers){
            sum += num;
        }
        return sum/numbers.length;
    }

    public static double maxGrade(int[] numbers){
        int maxGrade = numbers[0];

        for(int num : numbers){
            if (num>maxGrade){
                maxGrade = num;
            }
        }
        return maxGrade;
    }



    public static void main(String[] args) {


        int[] grades = {5, 10, 7, 8, 9, 9, 10, 12};

/*        ArrayList<Integer> integers = new ArrayList<>();
        integers.remove(10);*/

        int highest_marks = (int) maxGrade(grades);
        System.out.print("All the grades: ");
        printAllGrardes(grades);
        System.out.println("The highest grade is " + highest_marks);
        System.out.println("The average grade is " + averageGrade(grades));
    }

}

