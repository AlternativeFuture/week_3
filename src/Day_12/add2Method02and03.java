package Day_12;

public class add2Method02and03 {
    public static void main(String[] args) {
    start();
    }

    public static float add(int a, float b) {
      return a - b;
    }

    public static int add( float b ,int a) {
        return (int)(a - b);
    }

    public static void start() {
        int a = 9;
        float b = 7f;
        System.out.println(add(a, b));
        System.out.println(add(b, a));
    }
}
