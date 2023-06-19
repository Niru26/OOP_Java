package task_2_bank_app;

public class CreditAccount <T extends PersonalData> extends Account<T>{
    public CreditAccount(T data, double amount) {
        super(data, amount);
    }
}
