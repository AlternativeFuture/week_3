package Day_11;

import java.util.Scanner;

public class methodFib06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input n_");
        int n = scanner.nextInt();
        System.out.println(fib(n));
    }

    public static int fib(int n) {
        int first = 0;
        int second = 1;
        int temp;
        for (int i = 2; i <= n; i++) {
            if (n == 1) {
                return first;
            } else if (n == 2) {
                return second;
            } else {
                temp = first;
                first = second;
                second = first + temp;
            }
        }
        return second;
    }
}


