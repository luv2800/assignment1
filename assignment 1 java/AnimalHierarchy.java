class Animal {
    void speak() {
        System.out.println("Animal makes a sound");
    }
}

class Cat extends Animal {
    void speak() {
        System.out.println("Cat meows");
    }
}

class Dog extends Animal {
    void speak() {
        System.out.println("Dog barks");
    }
}

public class AnimalHierarchy {
    public static void main(String[] args) {
        Animal myAnimal1 = new Cat();
        Animal myAnimal2 = new Dog();

        myAnimal1.speak();
        myAnimal2.speak();
    }
}