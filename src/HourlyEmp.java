class HourlyEmp extends Employee {
    private double hourlyRate;
    private double hoursWorked;


    public HourlyEmp(String firstName, String lastName, String title, double hourlyRate, double hoursWorked) {
        super(firstName, lastName, title);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }


    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }


    @Override
    public void display() {
        super.display();
        System.out.println("Hourly Rate: $" + hourlyRate);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Weekly Salary: $" + calculateSalary());
    }
}
