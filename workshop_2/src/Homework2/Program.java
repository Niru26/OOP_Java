package Homework2;

public class Program {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Mitten", 5),
                new Cat("Lucky", 27),
                new Cat("Peaches", 19),
                new Cat("Fatty", 12),
                new Cat("Tom", 15),
        };
        Plate plate = new Plate();
        plate.putFood(45);
        System.out.println();
        for (Cat pet:
             cats) {
            pet.eat(plate);
        }
        System.out.println();
        for (Cat pet:
             cats) {
            if (pet.bellyful) {
            System.out.println(pet.name + " is satisfied.");
            } else {
                System.out.println(pet.name + " is hungry.");
            }
        }
    }
}
