package Lesson2.Inheritance.PersonEmployee;

public class Employee extends Person {

    String company;
    String titel;
    String test;

    public Employee(String name, String company, String titel, String test) {
        super(name);
        this.company = company;
        this.titel=titel;
        this.test=test;
    }


    public void display(){
        System.out.println("Name " + getName());
        System.out.println("Company: " + company);
        System.out.println("Titel: " + titel);
        System.out.println("Test: " + test);
    }

}
