package task_1;
// T - type
public class Account <T>{
    private final T id;
    private double amount;

    public T getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public Account(T id, double amount) {
        this.id = id;
        this.amount = amount;
    }
    @Override
    public String toString() {
        return String.format("Account identifier consist of: id - %s, letters part - %s.\n", id, amount);
    }
}
