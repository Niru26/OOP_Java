package static_example;

public class Cat extends Animal{
    private static int counter;

    public static int getCounter() {
        return counter;
    }

    {
        counter++;
    }

    public Cat(String name, int maxRun) {
        super(name, 0, maxRun);
    }

    @Override
    void swim(int distance) {
        System.out.println(name + " can't swim!");
    }
}
