package Lesson5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("John", 24));
        users.add(new User("Alice", 20));
        users.add(new User("Antonio", 14));
        users.add(new User("Kira", 24));

        for(User st : users){
            System.out.println(st.toString());
        }

        /*users.forEach(user -> {
            System.out.println("Name: " + user.getName() + ", Age" + user.getAge());
        });*/

        //Отсортируйте лист с помощью Collections.sort.
    }
}
