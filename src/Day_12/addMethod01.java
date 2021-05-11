package Day_12;

public class addMethod01 {
    public static void main(String[] args) {
    start();
    }

    public static void add(int a, int b, int c) {
        System.out.println("Method 1");
        System.out.println(a + b + c);

    }

    public static void add(int a, float z) {
        System.out.println("Method 2");
        System.out.println(a + z);
    }

    public static void add(float z, int a) {
        System.out.println("Method 3");
        System.out.println(a + z);
    }

    public static void start() {
        int a = 5, b = 6, c = 7;
        float z = 7f;
        add(a, b, c);
        add(a, z);
        add(z, a);
    }
}
