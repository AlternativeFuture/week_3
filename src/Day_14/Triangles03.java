package Day_14;

import java.util.Scanner;

public class Triangles03 {
    public static void main(String[] args) {
        start();
    }

    public static int calculate(int num){
        if(num == 0) {
            return 0;
        } return num + calculate(num -1);
    }





    public static void start(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input num ");
        int num = scanner.nextInt();
        System.out.println("Triangles "+ "("+num + ") ->" + calculate(num));
    }
}
