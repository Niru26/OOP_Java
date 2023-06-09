package tradeMachine;

import java.sql.Struct;
import java.util.List;

public class VendingMachine {
    protected List<Product> vendingProductsList;

    public VendingMachine(List<Product> internalList) {
        this.vendingProductsList = internalList;
    }

    public BottleOfWater getBottleOfWater (double volume) {
        for (Product item:
             vendingProductsList) {
            if (item instanceof BottleOfWater) {
                if (((BottleOfWater)item).getVolume() == volume) {
                    return (BottleOfWater)item;
                }

            }
        }
        return null;
    }

    public BottleOfMilk getBottleOfMilk(double volume) {
        for (Product item:
             vendingProductsList) {
            if (item instanceof BottleOfMilk) {
                if (((BottleOfMilk) item).getVolume() == volume) {
                    return (BottleOfMilk)item;
                }
            }
        }
        return null;
    }

    public ChocolateBar getChocolateBars(String taste) {
        for (Product item:
             vendingProductsList) {
            if(item instanceof ChocolateBar) {
                if(((ChocolateBar) item).getFlavour() == taste) {
                    return (ChocolateBar) item;
                }
            }
        }
        return null;
    }
}
