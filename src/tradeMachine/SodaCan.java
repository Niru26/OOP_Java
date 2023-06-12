package tradeMachine;

public class SodaCan extends Product {
    protected boolean withSugar;

    public boolean isWithSugar() {
        return withSugar;
    }

    public void setWithSugar(boolean withSugar) {
        this.withSugar = withSugar;
    }

    public SodaCan(String inputBrand, String inputName, double inputPrice, boolean withSugar) {
        super(inputBrand, inputName, inputPrice);
        this.withSugar = withSugar;
    }

    @Override
    public String displayInfo() {
        return String.format("%s: %s - %.2f", brand, name, price);
    }
}
