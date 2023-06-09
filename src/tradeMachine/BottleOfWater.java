package tradeMachine;

public class BottleOfWater extends Product {
    protected double volume;

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }


    public BottleOfWater(String inputBrand, String inputName, double inputPrice, double volume) {
        super(inputBrand, inputName, inputPrice);
        this.volume = volume;
    }
    @Override
    public String displayInfo() {
        return String.format("%s: %s - %.2f, volume - %.2f", brand, name, price, volume);
    }
}
