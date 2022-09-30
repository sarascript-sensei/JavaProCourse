package Lesson1;

public class SimpleGetterSetter {
    private int number;
    private String name;

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        if(number<10 || number > 100){
            throw new IllegalArgumentException();
        }
        this.number = number;
    }
}
