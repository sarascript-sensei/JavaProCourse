package Lesson6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListImplementation {
    public static void main(String[] args) {
        LinkedList<String> states = new LinkedList<>();
        states.add("Germany");
        states.add("Italy");
        states.add("France");
        states.add("Poland");
        states.addFirst("Greece");
        states.addLast("Check Republic");

        for(String state : states){
            System.out.println(state);
        }
        System.out.println("Size of list is " + states.size());
        System.out.println(states.get(1));
        states.set(5,"Norway");

        for(String state : states){
            System.out.println(state);
        }

        if(states.contains("Greece")){
            System.out.println("List contains Greece");
        }

        states.remove("Norway");
        states.remove(1);
        states.removeFirst();
        states.removeLast();

        // Создать класс Person с именем
        //Создать геттеры сеттеры
        //Создать LinkedList с объектом класса Person
        //Выполнить методы get, add, remove, а также пройтись по листу циклом (либо обычным for, либо for-each)

        LinkedList<Person> people = new LinkedList<Person>();
        people.add(new Person("Mike"));
        people.addFirst(new Person("Tom"));
        people.addLast(new Person("Nick"));
        people.remove(1);

        for(Person p : people){

            System.out.println(p.getName());
        }
        Person first = people.getFirst();
        System.out.println(first.getName());
    }
}

class Person{

    private String name;
    public Person(String value){

        name=value;
    }
    String getName(){return name;}
}
