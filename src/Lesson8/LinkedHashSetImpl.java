package Lesson8;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetImpl {
    public static void main(String[] args) {
        Set<String> countries = new LinkedHashSet<>();

        countries.add("India");
        countries.add("Australia");
        countries.add("South Africa");

        countries.add("India");

        System.out.println(countries);

        countries.remove("Australia");
        System.out.println("After remove: " + countries);

        System.out.println("Iterator impl");
        Iterator<String> i = countries.iterator();

        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
