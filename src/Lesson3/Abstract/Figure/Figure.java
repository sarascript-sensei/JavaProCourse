package Lesson3.Abstract.Figure;

abstract class Figure {
    protected String name = ""; //имя фигуры
    protected double pi = 3.1415; //число пи



    public String getName() {
        return name;
    }

    public abstract void showName();
    public abstract double getArea();

}

