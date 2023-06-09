package tradeMachine;

public class ChocolateBar extends Product {
    protected String flavour;

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public ChocolateBar(String inputBrand, String inputName, double inputPrice, String flavour) {
        super(inputBrand, inputName, inputPrice);
        this.flavour = flavour;
    }

    @Override
    public String displayInfo() {
        return String.format("%s: %s - %.2f, flavour - %s", brand, name, price, flavour);
    }
}
