package Lesson6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedArrayCompare {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        measureTime(linkedList);
        measureTime(arrayList);
        System.out.println(linkedList);
    }

    public static void measureTime(List<Integer> list){

        long start = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) { //добавление элементов в середину в 20 раз медленнее в linkedlist
            list.add(list.size()/2, i);
        }
        long finish = System.currentTimeMillis();
        System.out.println(finish-start);
    }


}
