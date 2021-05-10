package Day_11;

import java.util.Scanner;

public class methodIsPrime05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input n_");
        int n = scanner.nextInt();
        System.out.println(isPrime(n));
    }

    public static boolean isPrime(int n) {
        boolean flag = true;
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}


