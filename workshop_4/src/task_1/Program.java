package task_1;

public class Program {
    public static void main(String[] args) {
        SimpleAccount simpleAccount1 = new SimpleAccount(1431, 234.235);
        System.out.println(simpleAccount1);
        UniversalAccount universalAccount1 = new UniversalAccount(new AccountIdentifier(12521, "AZZ"), 2120.133);
        System.out.println(universalAccount1);
        System.out.println(((AccountIdentifier)universalAccount1.getId()).getId());
        System.out.println();
        Account<AccountIdentifier> account1 = new Account<>(new AccountIdentifier(12123, "KICK"),12000);
        AccountIdentifier accountIdentifier1 = account1.getId();
        System.out.println(accountIdentifier1.getId());

        Integer[] numbers = {2, 3, 534, 12, -12, 34, 1, 23, 56, 69};
        String[] names = {"Tomas", "Jerry", "Simpson", "Abu", "Kate"};
        String[] afterReplacement = ArrayUtils.replaceTwoElements(names, 1, 3);
        for (String name:
             afterReplacement) {
            System.out.println(name);
        }
    }
}
