package Lesson8;

import java.util.*;

public class SetImplement {
    public static void main(String[] args) {
        HashSet<Integer> myHashSet = new HashSet<>();

        myHashSet.add(1);
        myHashSet.add(2);
        myHashSet.add(3);

/*        for(int i : myHashSet){
            System.out.println(i);
        }*/

        for(int i = 0; i <10; i++){
            myHashSet.add(i);
        }



        myHashSet.remove(1);
        System.out.println("After remove");
        show(myHashSet);
        itershow(myHashSet);


        /*myHashSet.clear();//удаление всех элемент*/

        HashSet <Integer> myHashSet2 = new HashSet();
        myHashSet2.add(16);
        System.out.println("Совмещение двух множеств");
        myHashSet2.addAll(myHashSet);
        show(myHashSet2);

        HashSet<Integer> a = new HashSet<>();
        a.addAll(Arrays.asList(new Integer[]{2,3,4,6,8,9,0}));
        HashSet<Integer> b = new HashSet<>();

        b.addAll(Arrays.asList(new Integer[]{1,3,7,5,7,3}));

        HashSet<Integer> union = new HashSet<>(a);
        union.addAll(b);
        System.out.println("Совмещение двух множеств:");
        System.out.println(union);

        HashSet<Integer> intersection = new HashSet<>(a);
        intersection.retainAll(b);
        System.out.println("Пересечение двух множеств:");
        System.out.println(intersection);

        HashSet<Integer> difference = new HashSet<>(a);
        difference.removeAll(b);
        System.out.println("Разница во множествах");
        System.out.println(difference);

        int check = 2;
        System.out.println("Содержит " + check + " " + a.contains(check) );


    }

/*    Set setA = new EnumSet();
    Set setB = new HashSet();
    Set setC = new LinkedHashSet();
    Set setD = new TreeSet();*/

//Выполнить итерацию по множеству с помощью итератора

    public static void show(HashSet<Integer> myHashSet){
        for(int i : myHashSet){
            System.out.println(i);
        }
    }

    private static void itershow(Set<Integer> set) {
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
