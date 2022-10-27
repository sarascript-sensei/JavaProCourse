package Lesson9;

public class LuxuryCars implements Comparable<LuxuryCars>{
    private String model;
    private int manufactureYear;
    private int price;

    public LuxuryCars(String model, int manufactureYear, int price){
        this.model = model;
        this.manufactureYear = manufactureYear;
        this.price = price;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if(obj==null || getClass()!=obj.getClass()){
            return false;
        }
        LuxuryCars luxuryCars = (LuxuryCars) obj;

        if (manufactureYear!=luxuryCars.manufactureYear){
            return false;
        }
        if(price!=luxuryCars.price){
            return false;
        }

        return model.equals(luxuryCars.model);
    }

    @Override
    public int hashCode() {
        int result = model == null ? 0 : model.hashCode();
        result = 31 * result + manufactureYear;
        result = 31 * result + price;
        return result;
    }

    @Override
    public int compareTo(LuxuryCars o) {
        return this.getManufactureYear() - o.getManufactureYear();
    }

    @Override
    public String toString() {
        return "LuxuryCar{" +
                "model: " + model + '\'' +
                ",price: " + price +
                ", manufacture year: " + manufactureYear +
                '}';

    }

    //a<b
    //a>b
    //a==b
}
