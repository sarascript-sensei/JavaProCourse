package Lesson2.Inheritance.Box;


import Lesson2.Inheritance.Box.Box;

public class HeavyBox extends Box {
    int weight; // вес коробки

/*        // конструктор
        HeavyBox(int w, int h, int d, int m) {
            width = w;
            height = h;
            depth = d;
            weight = m; // масса
        }*/

    //Выполнение с использованием super
    // конструктор
    // инициализируем переменные с помощью ключевого слова super
    public HeavyBox(int w, int h, int d, int m) {
        super(w, h, d); // вызов конструктора суперкласса
        weight = m; // масса
    }
    public int getWeight() {
        return weight;
    }

    public int getVolume(){
        int res = width*height*depth;
        return res;
    }
}
