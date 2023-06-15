package static_example;

public abstract class Animal {
    protected String name;
    protected int maxSwim;
    protected int maxRun;
    protected int id;
    private static int counter;
    private static int identifier;

    public String getName() {
        return name;
    }

    public int getMaxSwim() {
        return maxSwim;
    }

    public int getMaxRun() {
        return maxRun;
    }

    public int getId() {
        return id;
    }

    public static int getCounter() {
        return counter;
    }

    public static int getIdentifier() {
        return identifier;
    }

    public Animal(String name, int maxSwim, int maxRun) {
        this.name = name;
        this.maxSwim = maxSwim;
        this.maxRun = maxRun;
    }

    void run(int distance) {
        if (distance <= maxRun) {
            System.out.printf("%s runs - %s\n", name, distance);
        } else {
            System.out.printf("%s failed to run - %s\n", name, distance);
        }
    }
    void swim(int distance) {
        if (distance <= maxSwim) {
            System.out.printf("%s swim - %s\n", name, distance);
        } else {
            System.out.printf("%s failed to swim - %s\n", name, distance);
        }
    }
    {
        name = "Animal";
        maxRun = 100;
        maxSwim = 50;
        id = ++identifier;
        counter++;
    }
    static {
        identifier = 100;
    }
}
