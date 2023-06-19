package task_1;

public class UniversalAccount {
    private final Object id;
    private double amount;

    public Object getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public UniversalAccount(Object id, double amount) {
        this.id = id;
        this.amount = amount;
    }
    @Override
    public String toString() {
        return String.format("Account identifier consist of: id - %s, letters part - %s.\n", id, amount);
    }
}
