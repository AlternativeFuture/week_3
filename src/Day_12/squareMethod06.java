package Day_12;

public class squareMethod06 {
    public static void main(String[] args) {
        start();
    }

    public static double square(int r) {
        return Math.PI * Math.pow(r, 2);
    }

    public static double square(float a) {
        return a * a;
    }

    public static double square(int a, float b) {
        return a * b;
    }

    public static void start() {
        int a = 2;
        float b = 3f;
        System.out.println(square(a));
        System.out.println(square(b));
        System.out.println(square(a, b));

    }
}

