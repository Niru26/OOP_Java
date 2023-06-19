package task_2_bank_app;

public class DebetAccount <T extends PersonalData> extends Account<T>{
    public DebetAccount(T data, double amount) {
        super(data, amount);
    }
}
