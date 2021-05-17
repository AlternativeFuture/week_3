package Day_14;

import java.util.Scanner;

public class Recursive0102 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(factorial(num));
    }
    public static int factorial(int num){
        if (num == 0){
            return 1;
        } return num * factorial(num -1);
    }
}
