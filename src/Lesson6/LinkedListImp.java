package Lesson6;

public class LinkedListImp {
    public static void main(String[] args) {
        LinkedListInside linkedListInside = new LinkedListInside();

        linkedListInside.add(4);
        linkedListInside.add(3);
        linkedListInside.add(2);
        linkedListInside.add(1);
        linkedListInside.add(0);
        System.out.println(linkedListInside.toString());
        System.out.println(linkedListInside.get(2));
        linkedListInside.remove(4);
        System.out.println(linkedListInside);
        System.out.println("Лист пустой(?)" + linkedListInside.isEmpty());
        System.out.println("Есть ли элемент в связном списке " + linkedListInside.contains(2));
        System.out.println("Есть ли элемент в связном списке " + linkedListInside.contains(20));

        LinkedListInside linkedListInside1 = new LinkedListInside();
        System.out.println("Лист пустой(?)" + linkedListInside1.isEmpty());

    }
}
