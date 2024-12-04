class SalaryEmp extends Employee {
    private double annualSalary;


    public SalaryEmp(String firstName, String lastName, String title, double annualSalary) {
        super(firstName, lastName, title);
        this.annualSalary = annualSalary;
    }


    @Override
    public double calculateSalary() {
        return annualSalary / 24;
    }


    @Override
    public void display() {
        super.display();
        System.out.println("Annual Salary: $" + annualSalary);
        System.out.println("Bi-Monthly Salary: $" + calculateSalary());
    }
}
