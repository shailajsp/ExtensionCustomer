import java.util.Scanner;

class Employee {
    private String firstName;
    private String lastName;
    private String title;


    public Employee(String firstName, String lastName, String title) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
    }


    public double calculateSalary() {
        return 0.0;
    }


    public void display() {
        System.out.println("Employee Name: " + firstName + " " + lastName);
        System.out.println("Employee Title: " + title);
    }
}
