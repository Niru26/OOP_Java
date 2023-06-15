package homework_3;

import java.util.Arrays;
import java.util.Random;

public class Program {
    static Random random = new Random();

    static Worker generateEmployee() {
        String[] names = new String[] {"Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман"};
        String[] surnames = new String[] {"Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов"};
        int salary = random.nextInt(20_000, 80_000);

        return new Worker(names[random.nextInt(names.length)], surnames[random.nextInt(surnames.length)], salary);
        };
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        for (int i = 0; i < employees.length; i++) {
            employees[i] = generateEmployee();
        }
        for (Employee person:
             employees) {
            System.out.println(person);
        }
        Arrays.sort(employees);
    }
}