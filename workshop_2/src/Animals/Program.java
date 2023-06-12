package Animals;

public class Program {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Mittens");
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

        public Cat(String name) {
            super(name);
        }

        @Override
        public void voice() {
            System.out.println("Cat meows");
        }
    }

