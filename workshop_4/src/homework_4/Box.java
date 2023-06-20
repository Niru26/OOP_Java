package homework_4;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> fruits;

    public Box(ArrayList<T> fruits) {
        this.fruits = fruits;
    }

    //    public float getWeight(ArrayList<T> fruitsPile) {
//        T calculatedMass;
//        for (T fruit:
//             fruitsPile) {
//            calculatedMass += fruit;
//        }
//    }
}
