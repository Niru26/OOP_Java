package tradeMachine;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Product product1 = new Product("Aksu", "Ice Tea with Lemon", 250.25);
//        product1.brand = "Aksu";
//        product1.name = "Ice Tea with Lemon";
        System.out.println(product1.displayInfo());
        System.out.println();
        Product bottleOfWater1 = new BottleOfWater("Tasai", "Icy water", 350.45, 1.5);
        Product bottleOfWater2 = new BottleOfWater("Sariagash", "Spring", 150.00, 2);
        Product bottleOfWater3 = new BottleOfWater("Aksu", "Uzenagash", 250.25, 0.5);
        Product bottleOfMilk1 = new BottleOfMilk("Foodmaster", "Kefir", 499.99, 1, 5);
        Product bottleOfMilk2 = new BottleOfMilk("Pavlodarskoe", "Domashnie", 249.99, 1.5, 2.5);
        Product chocolateBar1 = new ChocolateBar("Candy Factory", "Choocolator", 350.10, "Strawberry");
        Product chocolateBar2 = new ChocolateBar("Company inc.", "Mercury", 350.10, "Nuts");
        List<Product> allProducts = new ArrayList<>();
        allProducts.add(bottleOfWater1);
        allProducts.add(bottleOfMilk1);
        allProducts.add(bottleOfWater2);
        allProducts.add(bottleOfMilk2);
        allProducts.add(bottleOfWater3);
        allProducts.add(chocolateBar1);
        allProducts.add(chocolateBar2);

        VendingMachine vendingMachine = new VendingMachine(allProducts);
        BottleOfWater bottleOfWaterSearchResult = vendingMachine.getBottleOfWater(2);
        if (bottleOfWaterSearchResult != null) {
            System.out.println("You bought bottle of water:");
            System.out.println(bottleOfWaterSearchResult.displayInfo());
        } else {
            System.out.println("No bottle of such volume");
        }
        BottleOfMilk bottleOfMilkSearchResult = vendingMachine.getBottleOfMilk(0.5);
        if (bottleOfMilkSearchResult != null) {
            System.out.println("You bought bottle of milk:");
            System.out.println(bottleOfMilkSearchResult.displayInfo());
        } else {
            System.out.println("No such bottle in a list");
        }
        ChocolateBar chocolateBarSearch = vendingMachine.getChocolateBars("Nuts");
        if (chocolateBarSearch != null) {
            System.out.println("This is your bar: " + chocolateBarSearch.displayInfo());
        } else {
            System.out.println("No such taste");
        }
    }

}
