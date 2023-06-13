package Animals;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Mittens", "Red-White");
        ((Animal)cat1).voice();
        ((Animal)cat1).jump();
        System.out.println(cat1.getColor());
        System.out.println();
        Dog dog1 = new Dog("Balto", 12);
        dog1.voice();
        System.out.println(dog1.getWeight());
        List<Animal> listOfAnimals = new ArrayList<>();
        listOfAnimals.add(cat1);
        listOfAnimals.add(dog1);
        System.out.println();
        animalsActions(listOfAnimals);
    }
    public static void animalsActions (List<Animal> internalList) {
        for (Animal item:
             internalList) {
            item.voice();
            item.jump();
            if (item instanceof Cat) {
                System.out.println("This is a color, you searched for so long - " + ((Cat) item).getColor());
            }
        }
    }
}

    abstract class Animal {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Animal(String name) {
            this.name = name;
        }
        public void jump() {
            System.out.println("Animal jumped into the air.");
        }
        public abstract void voice();
    }

    class Dog extends Animal {
        private int weight;

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public Dog(String name, int weight) {
            super(name);
            this.weight = weight;
        }

        @Override
        public void voice() {
            System.out.println("Dog barking");
        }
    }

    class Cat extends Animal {
        private String color;

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public Cat(String name, String color) {
            super(name);
            this.color = color;
        }

        @Override
        public void voice() {
            System.out.println("Cat meows");
        }
    }

