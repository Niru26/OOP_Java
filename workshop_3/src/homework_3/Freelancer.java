package homework_3;

/**
 * TODO: finis construct class Employee.
 * TODO: 20 * 8 - add salary calculation method,
 */
public class Freelancer extends Employee {
    protected double hourlyRate;
    protected int workingHours;

    public Freelancer(String name, String surname, double hourlyRate, int workingHours) {
        super(name, surname, 0);
        this.hourlyRate = hourlyRate;
        this.workingHours = workingHours;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * workingHours;
    }

    @Override
    public String toString() {
        return String.format("%s %s: Freelancer. Flexible salary (monthly payment): %.2f.", surname, name, calculateSalary());
    }
}
