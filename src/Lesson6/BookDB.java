package Lesson6;

import java.util.ArrayList;
import java.util.List;

public class BookDB {
    List<Book> bookList;
    public BookDB(){
        bookList = new ArrayList<>();
    }

    public boolean removeBook(Book book){
        if(bookList.contains(book)){
            bookList.remove(book);
            return true;
        }
        return false;
    }
}
