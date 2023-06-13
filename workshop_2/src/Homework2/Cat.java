package Homework2;

public class Cat {
    protected String name;
    protected int appetit;

    protected int bellyful;

    public int getBellyful() {
        return bellyful;
    }

    public void setBellyful(int bellyful) {
        this.bellyful = bellyful;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetit() {
        return appetit;
    }

    public void setAppetit(int appetit) {
        this.appetit = appetit;
    }

    public Cat(String name, int appetit) {
        this.name = name;
        this.appetit = appetit;
    }
    public void eat() {

    }
}
