package homework_3;

import java.util.Arrays;
import java.util.Random;

public class Program {
    static Random random = new Random();

    static Employee generateEmployee() {
        String[] names = new String[] {"Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман"};
        String[] surnames = new String[] {"Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов"};
        int salary = random.nextInt(20_000, 80_000);
        int workingHours = random.nextInt(15, 57);
        double hourlyRate  = random.nextDouble(5.5, 27.9);
        int employeeTag = random.nextInt(1, 3);
        if (employeeTag == 1) {
            return new Worker(names[random.nextInt(names.length)], surnames[random.nextInt(surnames.length)], salary);
        }
        return new Freelancer(names[random.nextInt(names.length)], surnames[random.nextInt(surnames.length)], hourlyRate, workingHours);
    };
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        for (int i = 0; i < employees.length; i++) {
            employees[i] = generateEmployee();
        }

//      Arrays.sort(employees, new SalaryComparator());
        Arrays.sort(employees);
        System.out.println();

        for (Employee person:
                employees) {
            System.out.println(person);
        }
        System.out.println("***");
        Freelancer freelancer1 = new Freelancer("Vasia", "Bibikov", 10, 20 );
        System.out.println(freelancer1.calculateSalary());
    } // main end
}