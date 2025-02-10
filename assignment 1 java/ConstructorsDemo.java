class Car {
    String model;

    Car() {
        System.out.println("Default Constructor: Car Created");
    }

    Car(String model) {
        this.model = model;
        System.out.println("Parameterized Constructor: Car Model - " + model);
    }
}

public class ConstructorsDemo {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("Tesla");
    }
}