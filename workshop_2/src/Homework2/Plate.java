package Homework2;

public class Plate {
    protected int food;

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("Food on plate: " + food);
    }

    public void putFood(int foodPortion) {
        this.food += foodPortion;
        System.out.printf("Add %s. Current food amount: %s\n", foodPortion, food);
    }
    public boolean removeFood(int foodPortion) {
        if (this.food < foodPortion) {
            System.out.println("The food is not enough.");
            return false;
        }
        this.food -= foodPortion;
        System.out.printf("Removed food portion equals to: %s. Remain: %s.\n", foodPortion, food);
        return true;
    }
}
