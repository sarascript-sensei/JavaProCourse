package Lesson7_Iterator;

import java.util.Iterator;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        printStudentsPerCourses(new Methods().getStudents());
    }

    public static void printStudentsPerCourses(List<Student> students) {
        for (int i = Methods.START_COURSE; i <= Methods.FINISH_COURSE; i++) {
            System.out.println("Список студентов: " + i + "курса");
            printStudent(students, i);
            System.out.println();
        }
    }

    public static void printStudent(List<Student> students, int course) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }
}