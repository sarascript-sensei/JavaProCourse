package Lesson2.Inheritance.PersonEmployee;

public class Employee extends Person {

    String company;
    public Employee(String name, String company){
        super(name);
        this.company = company;
    }


    public void display(){
        System.out.println("Name " + getName());
        System.out.println("Company: " + company);

    }

}
