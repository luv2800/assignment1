class Demo {
    public int publicVar = 1;
    private int privateVar = 2;
    protected int protectedVar = 3;
    int defaultVar = 4; // default access

    public void show() {
        System.out.println("Public: " + publicVar);
        System.out.println("Private: " + privateVar);
        System.out.println("Protected: " + protectedVar);
        System.out.println("Default: " + defaultVar);
    }
}

public class AccessModifiers {
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.show();
    }
}