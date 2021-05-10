package Day_11;

import java.util.Scanner;

public class methodXor03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a_");
        int a = scanner.nextInt();
        System.out.print("Input b_");
        int b = scanner.nextInt();
        boolean boolA = intToBoolean(a);
        boolean boolB = intToBoolean(b);
        System.out.println(xor(boolA, boolB));
    }

    public static boolean xor(boolean a, boolean b) {
        return a != b;
    }

    public static boolean intToBoolean(int a) {
        return a != 0;
    }
}


