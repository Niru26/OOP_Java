package homework_3;

public class Worker extends Employee{
    public Worker(String name, String surname, double salary) {
        super(name, surname, salary);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s: Worker. Average salary (fixed monthly payment): %.2f.", surname, name, calculateSalary());
    }
}
