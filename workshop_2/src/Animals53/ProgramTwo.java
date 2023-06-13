package Animals53;


public class ProgramTwo {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Mittens", "Red-White");
        cat1.voice();
        System.out.println(cat1.getColor());
        System.out.println();

        Dog dog1 = new Dog("Balto", 12);
        dog1.voice();
        System.out.println(dog1.getWeight());
    }
}

interface movingOptions {
    void run(int runDistance);
    void swim(int swimDistance);
}

abstract class BaseCat {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BaseCat(String name) {
        this.name = name;
    }
    public void jump() {
        System.out.println("Animal jumped into the air.");
    }
    public abstract void voice();
}

abstract class BaseDog {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BaseDog(String name) {
        this.name = name;
    }
    public void jump() {
        System.out.println("Animal jumped into the air.");
    }
    public abstract void voice();
}

class Dog extends BaseDog implements movingOptions {
    private int weight;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Dog(String name, int weight) {
        super(name);
        this.weight = weight;
    }

    @Override
    public void voice() {
        System.out.println("Dog barking");
    }

    @Override
    public void run(int runDistance) {
        System.out.printf("Dog run %d meters", runDistance);
    }

    @Override
    public void swim(int swimDistance) {
        System.out.printf("Dog swim %d meters", swimDistance);
    }
}

class Cat extends BaseCat implements movingOptions{
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Cat(String name, String color) {
        super(name);
        this.color = color;
    }

    @Override
    public void voice() {
        System.out.println("Cat meows");
    }

    @Override
    public void run(int runDistance) {
        System.out.printf("Cat run %d meters", runDistance);
    }

    @Override
    public void swim(int swimDistance) {
        System.out.printf("Cat run %d meters", swimDistance);
    }
}
