import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Employee Type (1 for Salaried, 2 for Hourly): ");
        int empType = scanner.nextInt();
        scanner.nextLine();

        Employee emp = inputEmployee(scanner, empType);


        emp.display();
        scanner.close();
    }


    public static Employee inputEmployee(Scanner scanner, int empType) {
        System.out.println("Enter first name: ");
        String firstName = scanner.nextLine();
        System.out.println("Enter last name: ");
        String lastName = scanner.nextLine();
        System.out.println("Enter title: ");
        String title = scanner.nextLine();

        if (empType == 1) {
            System.out.println("Enter annual salary: ");
            double annualSalary = scanner.nextDouble();
            return new SalaryEmp(firstName, lastName, title, annualSalary);
        } else if (empType == 2) {
            System.out.println("Enter hourly rate: ");
            double hourlyRate = scanner.nextDouble();
            System.out.println("Enter hours worked: ");
            double hoursWorked = scanner.nextDouble();
            return new HourlyEmp(firstName, lastName, title, hourlyRate, hoursWorked);
        } else {
            System.out.println("Invalid Employee Type");
            return null;
        }
    }
}
