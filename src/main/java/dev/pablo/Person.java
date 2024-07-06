package dev.pablo;

public class Person {
    private String firstName;
    private String lastName;
    private String idNumber; 
    private int birthDate;

    public Person(String firstName, String lastName, String idNumber, int birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.birthDate = birthDate;
    }

    public void printAttributes() {
        System.out.println("First Name: " + this.firstName);
        System.out.println("Last Name: " + this.lastName);
        System.out.println("ID Number: " + this.idNumber);
        System.out.println("Birth Date: " + this.birthDate);
    }
}
