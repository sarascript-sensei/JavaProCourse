package Lesson3.Polymorfism;

public class Forms {
    String name = "Vasya";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void shapeArea(){
        System.out.println("Формулы: ");
    }
    public void shapeArea(int r){
        System.out.println("S Круга: " + 3.14*r*r);
    }

    public void shapeArea(double b, double h){

    }


}
