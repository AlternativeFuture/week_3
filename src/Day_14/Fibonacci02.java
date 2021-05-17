package Day_14;

import java.util.Scanner;

public class Fibonacci02 {
    public static void main(String[] args) {
        start();
    }

    public static int fibo(int num){
        if (num == 0 || num == 1){
            return 1;
        } return fibo(num-1) + fibo(num - 2);
    }





    public static void start(){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(fibo(num));
    }
}
