package tradeMachine;

public class BottleOfMilk extends Product {
    private double volume;
    private double fatContent;

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getFatContent() {
        return fatContent;
    }

    public void setFatContent(int fatContent) {
        this.fatContent = fatContent;
    }

    public BottleOfMilk(String inputBrand, String inputName, double inputPrice, double volume, double fatContent) {
        super(inputBrand, inputName, inputPrice);
        this.volume = volume;
        this.fatContent = fatContent;
    }

    @Override
    public String displayInfo() {
        return String.format("%s: %s - %.2f, volume - %.2f, fat content(%%) - %.1f", brand, name, price, volume, fatContent);
    }
}
