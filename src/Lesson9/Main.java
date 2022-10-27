package Lesson9;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //==
        //x==y

/*        String s1 = "ABC";
        String s2 = "ABC";

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        //hashCode(int value)

        int value = 144;
        System.out.println(Integer.hashCode(value));*/

        //Создать класс Car с параметрами model и maxSpeed. Создать 2 экземпляра класса и сравнить два объекта.


        LuxuryCars ferrari = new LuxuryCars("Ferrari", 1953, 7000000);
        LuxuryCars ferrari1 = new LuxuryCars("Ferrari Spider", 1934, 40);
        LuxuryCars ferrari2 = new LuxuryCars("Ferrari Spider 1", 1968, 500000);
        LuxuryCars ferrari3= new LuxuryCars("Ferrari Spider 2", 1951, 60000);

        System.out.println(ferrari.equals(ferrari1));
        System.out.println(ferrari.hashCode());
        System.out.println(ferrari1.hashCode());

        String name1 = "Саша";
        String name2 = "Маша";
        String name3 = "Даша";

        List<String> names = new ArrayList<>();
        names.add(name1);
        names.add(name2);
        names.add(name3);

        Collections.sort(names);
        System.out.println(names);

        List<LuxuryCars> cars = new ArrayList<>();

        cars.add(ferrari);
        cars.add(ferrari1);
        cars.add(ferrari2);
        cars.add(ferrari3);
        System.out.println("Сортировка по году выпуска: ");
        Collections.sort(cars);
        // Collections.reverse(cars); - как вариант обратной сортировки
        System.out.println(cars.toString());

        System.out.println("Сортировка по цене: ");
        Comparator priceComparator = new MaxPriceComparator();
        Collections.sort(cars, priceComparator);

        System.out.println(cars);

    }
}
