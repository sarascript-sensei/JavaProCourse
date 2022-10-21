package Lesson7_Iterator;

import java.util.*;

public class MainIteration {

    public static void main(String[] args) {
        Integer[] array = new Integer[]{43, 23, 4, 1, 2, 3, 4};

        LinkedList<Integer> list = new LinkedList<>();

        Collections.addAll(list, array);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        LinkedList<Integer> list1 = fillListWithRandoms();

        Iterator<Integer> iterator1 = list1.iterator();

        //Метод удаления
        while (iterator1.hasNext()) {
            int item = iterator1.next();
            if (item >= 256) {
                iterator1.remove();
            }

        }
    }

    //Дан массив arr[], состоящий из n числовых значений. Удалите все элемент, которые меньше k.

    public static LinkedList<Integer> fillListWithRandoms() {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 5000; i++) {
            list.add((int) Math.round(Math.random() * 256));
        }
        return list;
    }
}
