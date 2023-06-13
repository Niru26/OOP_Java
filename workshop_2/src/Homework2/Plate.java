package Homework2;

public class Plate {
    protected int food;

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public Plate(int food) {
        this.food = food;
    }
    public void info() {
        System.out.println("Food on plate: " + food);
    }
}
