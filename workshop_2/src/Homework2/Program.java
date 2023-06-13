package Homework2;

public class Program {
    public static void main(String[] args) {
        Cat cat = new Cat("Mitten", 5);
        Plate plate = new Plate(100);

        plate.info();
        cat.eat();
        plate.setFood(plate.getFood() - cat.getAppetit());
        if (plate.food <= cat.appetit) {
            System.out.println("Not enougth food");
        }
    }
}
