package Lesson2.Interface;

public class Book implements Printable, Searchable{
    String name;
    String author;

    public Book(String name, String author){
        this.name = name;
        this.author = author;
    }
    @Override
    public void print() {
        System.out.println("Name of book: " + name + " Author of book" + author);
    }

    @Override
    public void search() {
        System.out.println("Book " + name + "has searched");
    }
}

//Создать класс Journal с одним параметром в конструкторе (name)
//Также переопределить метод print() из интерфейса Printable и вывести просто name журнала.


// Создадим интерфейс Messanger с двумя методами: getMessage, sendMessage
// Создадим два класса: Telegram, WhatsApp
// Имплементируем методы из интерфейсы, переопределив их таким образом:
//Вывод: Отправляем сообщение в Telegram
//Вывод: Читаем сообщение из Telegram
// и т д

