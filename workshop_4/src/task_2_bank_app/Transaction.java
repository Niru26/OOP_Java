package task_2_bank_app;

public class Transaction <T extends Account<? extends PersonalData>>{
    private final T from;
    private final T to;
    private final double amount;

    public Transaction(T from, T to, double amount) {
        this.from = from;
        this.to = to;
        this.amount = amount;
    }
    public void execute() {
        if (from.getAmount() > amount) {
            System.out.printf("Transaction between accounts at sum %.2f. \n", amount);
            System.out.printf("From %s: %.2f, \nTo %s: %.2f \n",
                    from.getData(), from.getAmount(), to.getData(), to.getAmount());
            from.setAmount(from.getAmount() - amount);
            to.setAmount(to.getAmount() + amount);

            System.out.println("Current state:");
            System.out.println(from);
            System.out.println(to);
        } else {
            System.out.println("No money");
        }
    }
}
