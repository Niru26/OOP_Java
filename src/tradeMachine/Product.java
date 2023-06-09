package tradeMachine;
/* 1. Each class need to create in separate file.

 */
public class Product {
    protected String name;
    protected String brand;
    protected double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double inputPrice) {
        checkPrice(inputPrice);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Product() {
        this("Water", 200);
    }
    Product(String inputBrand, String inputName, double inputPrice) {
        checkPrice(inputPrice);
        brand = inputBrand;
        if(inputName.length() < 3) {
            name = "Product";
        } else {
            name = inputName;
        }
    }
    Product(String inputName, double inputPrice) {
        this("Domestic company", inputName, inputPrice);
    }

    private void checkPrice(double inputPrice) {
        if (inputPrice <= 0) {
            price = 200;
        } else {
            price = inputPrice;
        }
    }

    public String displayInfo() {
        return String.format("%s: %s - %.2f", brand, name, price);
    }
}
