package dev.pablo;

public class App {
    public static void main(String[] args) {
        Person person1 = new Person("Pablo", "Abad", "123456789", 1988);
        Person person2 = new Person("Gia", "Como", "987654321", 1980);

        System.out.println("Person 1:");
        person1.printAttributes();

        System.out.println("\nPerson 2:");
        person2.printAttributes();
    }
}