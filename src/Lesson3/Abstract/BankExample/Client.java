package Lesson3.Abstract.BankExample;

public class Client extends Person implements Movable{
    private String bank;

    public Client(String name) {
        super(name);
        this.bank = "Bank";
    }



    @Override
    public void move() {

    }
}

