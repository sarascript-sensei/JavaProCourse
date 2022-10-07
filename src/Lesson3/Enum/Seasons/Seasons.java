package Lesson3.Enum.Seasons;

public enum Seasons {
    WINTER,
    SPRING,
    SUMMER,
    AUTUMN;



    private double temp;

    public double getTemp() {
        return temp;
    }

    public void getDescription(){
        System.out.println("Холодное время года");
    }
}
