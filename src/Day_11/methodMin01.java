package Day_11;

import java.util.Scanner;

public class methodMin01 {

    public static int min(int a, int b, int c, int d) {
        if (a <= b && a <= c && a <= d) {
            return a;
        } else if (b <= a && b <= c && b <= d) {
            return b;
        } else if (c <= a && c <= b && c <= d) {
            return c;
        } else {return d;}
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a_");
        int a = scanner.nextInt();
        System.out.print("Input b_");
        int b = scanner.nextInt();
        System.out.print("Input c_");
        int c = scanner.nextInt();
        System.out.print("Input d_");
        int d = scanner.nextInt();
        System.out.println(min(a, b, c, d));

    }
}
