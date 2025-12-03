package Lesson2.Inheritance.PersonEmployee;

public class Employee extends Person {

    String company;
    String titel;

    public Employee(String name, String company, String titel){
        super(name);
        this.company = company;
        this.titel=titel;
    }


    public void display(){
        System.out.println("Name " + getName());
        System.out.println("Company: " + company);
        System.out.println("Titel: " + titel);
    }

}
