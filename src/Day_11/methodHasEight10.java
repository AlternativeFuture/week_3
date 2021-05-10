package Day_11;

import java.util.Scanner;

public class methodHasEight10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input checking number_");
        int num = scanner.nextInt();
        System.out.println(hasEight(num));

    }

    public static boolean hasEight(int number) {
        while (number > 0) {
            if (number % 10 == 8) {
                return true;
            }
            number /= 10;
        }
        return false;
    }
}


