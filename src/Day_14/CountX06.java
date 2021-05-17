package Day_14;

import java.util.Scanner;

public class CountX06 {
    public static void main(String[] args) {
        start();
    }

    static int count = 0;

    public static int countX(String str) {
        if (str.length() == 0) {
            return count;
        } else if (str.charAt(0) == 'x') {
            return 1 + countX(str.substring(1));
        } else return countX(str.substring(1));

    }

    public static void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number_ ");
        String str = scanner.nextLine();
        System.out.println("Count of N in number ->" + countX(str));
    }
}
