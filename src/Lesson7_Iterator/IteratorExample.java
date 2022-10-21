package Lesson7_Iterator;

import java.util.ArrayList;
import java.util.Iterator;


public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> states = new ArrayList<>();
        states.add("Germany");
        states.add("Italy");
        states.add("Rome");
        states.add("Spain");

        Iterator<String> iter = states.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
