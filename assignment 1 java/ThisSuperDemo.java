class Parent {
    int x = 10;
}

class Child extends Parent {
    int x = 20;

    void show() {
        System.out.println("Child x: " + this.x);
        System.out.println("Parent x: " + super.x);
    }
}

public class ThisSuperDemo {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();
    }
}