package Day_11;

import java.util.Scanner;

public class methodMagicSum11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number_");
        int num = scanner.nextInt();
        int sum = 0;
        while (num != -1) {
            System.out.print("Input number_");
            num = scanner.nextInt();
            sum += magicSum(num);
        }
        System.out.println(sum);
    }

    public static int magicSum(int number) {
        int checkingNum = number;
        while (checkingNum > 0) {
            if (checkingNum % 10 == 8) {
                return number;
            }
            checkingNum /= 10;

        } return 0;
    }
}


