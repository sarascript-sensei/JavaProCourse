package Lesson7_Iterator;

import java.util.LinkedList;
import java.util.List;

public class Methods {
    public static int START_COURSE = 1;
    public static int FINISH_COURSE = 5;
    public List<Student> students;

    public Methods(){
        students = new LinkedList<>();
        fillStudentsList();
    }

    public Methods(List<Student> students){
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public void fillStudentsList(){
        students.add(new Student("Андрей Птушкин",5));
        students.add(new Student("Алексей К",5));
        students.add(new Student("Александра П",1));
        students.add(new Student("Настасья П",4));
        students.add(new Student("Ирина П",2));
        students.add(new Student("Олег П",1));
    }
}
