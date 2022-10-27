package Lesson8;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        System.out.println("Список команд:" +
                "LIST — выводит дела с их порядковыми номерами;\n" +
                "ADD — добавляет дело в конец списка или дело на определённое место, сдвигая остальные дела вперёд, если указать номер; если указан несуществующий индекс - добавить в конец списка.\n" +
                "EDIT — заменяет дело с указанным номером; если указан несуществующий индекс - ничего не делать.\n" +
                "DELETE — удаляет; если указан несуществующий индекс - ничего не делать.\n" +
                "Вызови команду:  ");
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> todoList = new ArrayList<>();
        todoList.add(0,"Позавтракать");
        todoList.add(1, "Умыться");
        todoList.add(2,"Купить молоко");

        while (true){
            String comanda = scanner.nextLine();
            String [] naSlova = comanda.split(" ");
            for(int i = 0; i < naSlova.length; i++){
                if(naSlova[i].equals("LIST")){
                    for(int j = 0; j<todoList.size(); j++){
                        System.out.println(todoList.get(j));
                    }
                } else if (naSlova[0].equals("ADD") && naSlova.length == 3) {//ADD buy milk
                    todoList.add(naSlova[1] + " " + naSlova[2]);
                    System.out.println("Вы добавили новое дело в конец списка");
                    for(int j = 0; j<todoList.size();j++){
                        System.out.println(todoList.get(j));
                    }
                    break;
                }else if(naSlova[0].equals("ADD") && naSlova.length > 3){ //ADD 2 buy milk
                    todoList.add(Integer.parseInt(naSlova[1])-1, naSlova[2] + " " + naSlova[3]);
                    System.out.println("Вы заменили дело в позиции номер: " + naSlova[1] + "на: " + naSlova[2] + "\nИзмененный список: ");
                    for(int j = 0; j<todoList.size();j++){
                        System.out.println(todoList.get(j));
                    }
                    break;
                }else if(naSlova[0].equals("EDIT") && naSlova.length > 3) {
                    todoList.set(Integer.parseInt(naSlova[1]) - 1, naSlova[2] + " " + naSlova[3]);
                    System.out.println("Вы заменили дело в позции номер: " + naSlova[1] + " на: " + naSlova[2] +
                            "\n Измененный список дел");
                    for (int j = 0; j < todoList.size(); j++) {
                        System.out.println(todoList.get(j));
                    }
                    break;
                } else if (naSlova[0].equals("DELETE") && naSlova.length==2) { //DELETE 2 - удалит купить молоко
                    System.out.println("Вы удалили дело: " + todoList.get(Integer.parseInt(naSlova[1])-1)+
                            ", которое было в позиции номер: " + naSlova[1] );
                    todoList.remove(Integer.parseInt(naSlova[1])-1);
                    for (int j = 0; j < todoList.size(); j++) {
                        System.out.println(todoList.get(j));
                    }
                    break;
                }
                else {
                    System.out.println("Не верная команда. Вызовите правильную");
                }
            }
        }
    }
}
