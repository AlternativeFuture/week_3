package Day_14;

import java.util.Scanner;

public class SumOfDigits04 {
    public static void main(String[] args) {
        start();
    }

    public static int calculate(int num){
        if(num == 0) {
            return 0;
        }
        return num%10 + calculate(num/10);
    }

    public static void start(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input num ");
        int num = scanner.nextInt();
        System.out.println("Sum of digits ->" + calculate(num));
    }
}
