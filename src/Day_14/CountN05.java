package Day_14;

import java.util.Scanner;

public class CountN05 {
    public static void main(String[] args) {
        start();
    }

    public static int calculate(int num, int count) {
        if (num == 0) {
            return count;
        }
        if (num % 10 % 7 == 0){count ++;}
        return calculate(num / 10,count);
    }

    public static void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number_ ");
        int num = scanner.nextInt();
        int count = 0;
        System.out.println("Count of N in number ->" + calculate(num, count));
    }
}
