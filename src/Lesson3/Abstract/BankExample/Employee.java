package Lesson3.Abstract.BankExample;

class Employee extends Person {
    private String bank;

    public Employee(String name) {
        super(name);
        this.bank = "Bank";
    }
}

