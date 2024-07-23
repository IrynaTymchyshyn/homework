import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Базовий клас Animal
abstract class Animal implements Comparable<Animal> {
    protected String name;
    protected double weight;
    protected int age;

    public Animal(String name, double weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public abstract void speak();
    public abstract void eat();
    public abstract void specialAbility();

    @Override
    public int compareTo(Animal other) {
        // Порівнюю спочатку за вагою, потім за віком
        int weightComparison = Double.compare(this.weight, other.weight);
        if (weightComparison != 0) {
            return weightComparison;
        }
        return Integer.compare(this.age, other.age);
    }

    @Override
    public String toString() {
        return String.format("%s: Weight=%.2f, Age=%d", name, weight, age);
    }
}

// Клас Cat
class Cat extends Animal {
    public Cat(String name, double weight, int age) {
        super(name, weight, age);
    }

    @Override
    public void speak() {
        System.out.println(name + " says: Meow!");
    }

    @Override
    public void eat() {
        System.out.println(name + " eats: Cat food.");
    }

    @Override
    public void specialAbility() {
        System.out.println(name + " can: Hunt mice.");
    }
}

// Клас Dog
class Dog extends Animal {
    public Dog(String name, double weight, int age) {
        super(name, weight, age);
    }

    @Override
    public void speak() {
        System.out.println(name + " says: Woof!");
    }

    @Override
    public void eat() {
        System.out.println(name + " eats: Dog food.");
    }

    @Override
    public void specialAbility() {
        System.out.println(name + " can: Guard the house.");
    }
}

// Клас Dove
class Dove extends Animal {
    public Dove(String name, double weight, int age) {
        super(name, weight, age);
    }

    @Override
    public void speak() {
        System.out.println(name + " says: Coo!");
    }

    @Override
    public void eat() {
        System.out.println(name + " eats: Seeds.");
    }

    @Override
    public void specialAbility() {
        System.out.println(name + " can: Fly.");
    }
}

// Клас Fish
class Fish extends Animal {
    public Fish(String name, double weight, int age) {
        super(name, weight, age);
    }

    @Override
    public void speak() {
        System.out.println(name + " says: Blub blub!");
    }

    @Override
    public void eat() {
        System.out.println(name + " eats: Fish flakes.");
    }

    @Override
    public void specialAbility() {
        System.out.println(name + " can: Swim.");
    }
}

// Клас Lion
class Lion extends Animal {
    public Lion(String name, double weight, int age) {
        super(name, weight, age);
    }

    @Override
    public void speak() {
        System.out.println(name + " says: Roar!");
    }

    @Override
    public void eat() {
        System.out.println(name + " eats: Meat.");
    }

    @Override
    public void specialAbility() {
        System.out.println(name + " can: Hunt in packs.");
    }
}

// Основний клас для демонстрації
public class AnimalDemo {
    public static void main(String[] args) {
        // Створення списку тварин
        List<Animal> animals = new ArrayList<>();
        animals.add(new Cat("Kitty", 4.5, 3));
        animals.add(new Dog("Buddy", 15.0, 5));
        animals.add(new Dove("Chirpy", 0.3, 2));
        animals.add(new Fish("Goldie", 0.1, 1));
        animals.add(new Lion("Simba", 190.0, 8));

        // Демонстрація поведінки тварин
        for (Animal animal : animals) {
            System.out.println(animal);
            animal.speak();
            animal.eat();
            animal.specialAbility();
            System.out.println();
        }

        // Сортую тварини за вагою та віком
        Collections.sort(animals);

        System.out.println("Тварини після сортування:");
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }
}
