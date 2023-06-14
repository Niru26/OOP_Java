package Homework2;

public class Cat {
    protected String name;
    protected int appetit;

    protected boolean bellyful;

    public boolean getBellyful() {
        return bellyful;
    }

    public void setBellyful(boolean bellyful) {
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

    public boolean isBellyful() {
        return bellyful;
    }

    public Cat(String name) {
        this.name = name;
        this.bellyful = false;
    }

    public Cat(String name, int appetit) {
        this.name = name;
        this.appetit = appetit;
        this.bellyful = false;
    }

    public void eat(Plate plate) {
        if(plate.removeFood(this.appetit)){
            System.out.printf("%s ate enough, according it appetite - %s\n", this.name, this.appetit);
            this.bellyful = true;
        } else {
            System.out.println(this.name + " is sad, add demand addition!");
        }
    }
}
