package Day_12;

public class MaxMethod07 {
    public static void main(String[] args) {
        start();
    }

    public static double max(int[] args) {
        int max = 0;
        for (int arg : args) {
            if (arg > max) {
                max = arg;
            }
        }
        return max;
    }

    public static void start() {
        int a = 2, b = 3, c = 4, d = 7;
        System.out.println(max(new int[]{a, b}));
        System.out.println(max(new int[]{a, b, c}));
        System.out.println(max(new int[]{a, b, c, d}));
    }
}

