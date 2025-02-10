class MathOperations {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

class AdvancedMathOperations extends MathOperations {
    @Override
    int add(int a, int b) {
        return a + b + 10; // Overriding the method
    }
}

public class MethodOverloadingOverriding {
    public static void main(String[] args) {
        AdvancedMathOperations obj = new AdvancedMathOperations();
        System.out.println("Overloaded: " + obj.add(2, 3, 4));
        System.out.println("Overridden: " + obj.add(2, 3));
    }
}