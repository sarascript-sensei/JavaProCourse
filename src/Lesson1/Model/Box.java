package Lesson1.Model;


public class Box {
    public double width;
    public double height;
    public double depth;

    //Создать метод getVolume, который выполняет операцию нахождения объема

    public double getVolume(double width, double height, double depth){
        return width*height*depth;
    }
}
