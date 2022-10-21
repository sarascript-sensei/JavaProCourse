package Lesson6;

import java.util.Arrays;

public class LinkedListInside {
    private Node head;

    private int size;

    public void add(int value){
        if(head==null){
            this.head = new Node(value);
        }else {
            Node temp = head;
            while (temp.getNext()!=null){
                temp = temp.getNext();
            }
            temp.setNext(new Node(value));
        }
        size++;
    }

    public int get(int index){
        int currentIndex = 0;
        Node temp = head;

        while (temp!=null){
            if(currentIndex == index){
                return temp.getValue();
            }else {
                temp = temp.getNext();
                currentIndex++;
            }
        }
        return -1;
    }

    public void remove(int index){
        if(index == 0){
            head = head.getNext();
            size--;
            return;
        }

        Node temp = head;
        int currentIndex = 0;

        while(temp!=null){
            if(currentIndex == index - 1){
                temp.setNext(temp.getNext().getNext()); //4->3->2->1->0 -> 4,3->->1,0;
                size--;
                return;
            }else{
                temp = temp.getNext();
                currentIndex++;
            }
        }
    }

    public String toString(){
        int [] result = new int[size];
        int index = 0;
        Node temp = head;
        while(temp!=null){
            result[index++] = temp.getValue();
            temp = temp.getNext();
        }
        return Arrays.toString(result);
    }

    //Создайте метод isEmpty
    //Создайте метод contains(int value)

    public boolean isEmpty(){
        if(size==0){
            return true;
        }
        return false;
    }

    public boolean contains(int value){
        if(isEmpty()){
            return false;
        }
        Node temp;
        for (temp=head; temp!=null; temp=temp.getNext()){
            if(temp.value==value){
                return true;
            }
        }
        return false;
    }

private static class Node{
    private Node next;
    private int value;

    public Node(int value){
    this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public int getValue() {
        return value;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
}
