final class FinalClass {
    final int finalVar = 100;

    final void finalMethod() {
        System.out.println("This is a final method.");
    }
}

public class FinalKeywordDemo {
    public static void main(String[] args) {
        FinalClass obj = new FinalClass();
        System.out.println("Final Variable: " + obj.finalVar);
        obj.finalMethod();
    }
}