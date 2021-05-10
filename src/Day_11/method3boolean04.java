package Day_11;

import java.util.Scanner;

public class method3boolean04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a_");
        int a = scanner.nextInt();
        System.out.print("Input b_");
        int b = scanner.nextInt();
        System.out.print("Input c_");
        int c = scanner.nextInt();
        boolean boolA = intToBoolean(a);
        boolean boolB = intToBoolean(b);
        boolean boolC = intToBoolean(c);
        System.out.println(election(boolA, boolB, boolC));
    }

    public static boolean election(boolean a, boolean b, boolean c) {
        if (a == b) {
            return a;
        } else if (a == c) {
            return a;
        } else if (c == b) {
            return c;
        }
        return false;
    }

    public static boolean intToBoolean(int a) {
        return a != 0;
    }
}


