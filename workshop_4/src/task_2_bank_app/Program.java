package task_2_bank_app;

public class Program {
    public static void main(String[] args) {
        // new Account<Person>(new Person("Robson", "124121"), 23000);
        DebetAccount<Entity> entityDebetAccount1 =
                new DebetAccount<>(new Entity("Bank Company", "23411"), 50_000);
        CreditAccount<Person> personCreditAccount1 =
                new CreditAccount<>(new Person("Tomas", "12345"), 1_000.37);
        Transaction<Account<?>> transaction = new Transaction<>(entityDebetAccount1, personCreditAccount1, 30_000);
        transaction.execute();
        transaction.execute();
    }
}
