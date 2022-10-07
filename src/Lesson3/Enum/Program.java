package Lesson3.Enum;

public class Program {
    public static void main(String[] args) {
        /*Directions d1 = Directions.EAST;
        System.out.println(d1);*/

        Book b1 = new Book("War and peace", Type.BELLETRE, "L.Tolstoy");
        System.out.println("Book: " + b1.name + " has a type " + b1.bookType);

        switch (b1.bookType){
            case SCIENCE -> System.out.println("It's science");
            case SCIENCE_FICTION -> System.out.println("It's science Fiction");
        }
    }
}
