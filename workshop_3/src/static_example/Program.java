package static_example;

public class Program {
    public static void main(String[] args) {
         Cat cat1 = new Cat("Mittens", 200);
         cat1.run(50);
         System.out.println(cat1.getId());

        Cat cat2 = new Cat("Lucky", 300);
        cat2.run(310);
        System.out.println(cat2.getId());

        Cat cat3 = new Cat("Tomas", 200);
        cat3.run(150);
        System.out.println(cat3.getId());

        Dog dog1 = new Dog("Diamond", 350, 2000);
        Dog dog2 = new Dog("Snoop Doggy", 50, 2);
        System.out.printf("%s cat objects was created \n", Cat.getCounter());
        System.out.printf("%s dog objects was created \n", Dog.getCounter());
        System.out.printf("%s animal objects was created \n", Animal.getCounter());
    }
}
