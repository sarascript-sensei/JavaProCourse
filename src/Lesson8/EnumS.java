package Lesson8;

import java.util.EnumSet;
import java.util.Set;



public class EnumS {
    public static void main(String[] args) {
        enum enums {Code, Learn, Quiz, Exams};
        Set<enums> set1;

        set1 = EnumSet.of(enums.Code, enums.Exams, enums.Quiz, enums.Learn);

        System.out.println("Множество 1: " + set1);
    }
}