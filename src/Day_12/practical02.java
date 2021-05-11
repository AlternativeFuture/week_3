package Day_12;

import java.util.Scanner;

public class practical02 {
    public static void main(String[] args) {
        start();

    }

    public static double calculateDistance(double x, double y) {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    public static double calculateDistance(double x1, double x2, double y1, double y2) {
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }

    public static double[] input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input x_");
        double x = scanner.nextDouble();
        System.out.print("Input y_");
        double y = scanner.nextDouble();
        return new double[]{x, y};
    }

    public static double[] input(int a) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input x1_");
        double x1 = scanner.nextDouble();
        System.out.print("Input y1_");
        double y1 = scanner.nextDouble();
        System.out.print("Input x2_");
        double x2 = scanner.nextDouble();
        System.out.print("Input y2_");
        double y2 = scanner.nextDouble();
        return new double[]{x1, x2, y1, y2};
    }

    public static int choice() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input 2 for 2 arguments calculation or 4 for for arguments_");
        return scanner.nextInt();
    } public static void start() {
        while (true) {
            int choice = choice();
            if (choice == 2) {
                double[] input = input();
                System.out.println(calculateDistance(input[0], input[1]));
            } else if (choice== 4) {
                double[] input = input(4);
                System.out.println(calculateDistance(input[0], input[1], input[2], input[3]));
            }
        }
    }
}
