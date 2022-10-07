package Lesson3.Enum;

public enum Directions {
    NOTRH,
    SOUTH,
    EAST,
    WEST;

    public static void main(String[] args) {
        Directions d1 = Directions.NOTRH;
        System.out.println(d1);

        switch (d1){
            case EAST -> System.out.println("EAST direction");
            case WEST -> System.out.println("WEST direction");
            case SOUTH -> System.out.println("SOUTH direction");
            case NOTRH -> System.out.println("NOTRH direction");
        }

    }
}


    // Создайте switch - case для всех констант и выведите на консоль к примеру:
    //case (EAST) - > east direction
