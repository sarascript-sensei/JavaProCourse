package Lesson1;

public class Program {

    public static void main(String[] args) {
        Person kate = new Person("Kate", 32, "Baker Street", "+4915753466999");

        kate.displayName();
        kate.displayAge();
        kate.displayPhone();
       // kate.displayAddress(); //Не выведится из-за модификатора доступа private

        System.out.println(kate.name);
        System.out.println(kate.age);
        System.out.println(kate.address);
    }
}

    class Person{
        String name;
        protected int age;
        public String address;
        private String number;

        public Person(String name, int age, String address, String number){
            this.name = name;
            this.age = age;
            this.address = address;
            this.number = number;
        }

        public void displayName(){
            System.out.printf("Name: %s \n", name);
        }

        void displayAge(){
            System.out.printf("Age: %d \n", age);
        }

        private void displayAddress(){
            System.out.printf("Address: %s \n", address);
        }

        protected void displayPhone(){
            System.out.printf("Phone: %s \n", number);
        }
    }
