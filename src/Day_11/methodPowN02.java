package Day_11;

import java.util.Scanner;

public class methodPowN02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a_");
        int a = scanner.nextInt();
        System.out.print("Input n_");
        int n = scanner.nextInt();
        System.out.println(powN(a , n));
    }
    public static double powN(double a, int n){
        return Math.pow(a, n);
    }
}
