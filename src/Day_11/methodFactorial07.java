package Day_11;

import java.util.Scanner;

public class methodFactorial07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a_");
        int a = scanner.nextInt();
        System.out.println(factorial(a));
    }

    public static int factorial(int n) {

        int res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
        }
        return res;
    }
}


