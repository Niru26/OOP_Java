package Animals;

public class Program {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Mittens", "Red-White");
        cat1.voice();

        Dog dog1 = new Dog("Balto");
        dog1.voice();
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
        public Dog(String name) {
            super(name);
        }

        @Override
        public void voice() {
            System.out.println("Dog is barking");
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

