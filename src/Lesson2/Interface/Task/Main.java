package Lesson2.Interface.Task;

public class Main {
    public static void main(String[] args) {

        Student student = new Aspirant(4.0);
        System.out.println(student.getScolarship());

        Student[] students = {new Student(3.0), new Aspirant(5.0)};

        for (Student st : students) {
            System.out.println(st.getScolarship());
        }
    }
}
