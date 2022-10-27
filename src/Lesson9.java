import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lesson9 {
    public static void main(String[] args) {
        Set<String> ts = new TreeSet<>();

        ts.add("India");
        ts.add("Australia");
        ts.add("South Africa");

        ts.add("India");
        System.out.println(ts);

        Set<Integer> intsSet = new HashSet<>();
        intsSet.add(2);
        intsSet.add(1);
        intsSet.add(5);
        intsSet.add(7);
        intsSet.add(3);
        intsSet.add(56);
        System.out.println(intsSet);

        Set<Integer> sortedSet = new TreeSet<>(intsSet);
        System.out.println("Sorted Set: " + sortedSet);
    }
}
