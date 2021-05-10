package Day_11;

import java.util.Arrays;
import java.util.Scanner;

public class methodCopyOf14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input length of area_");
        int len = scanner.nextInt();
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            System.out.print("Input elements of area_");
            int num = scanner.nextInt();
            array[i] = num;
        }
        int[] copyOfArray = copyOf(array);
        for (int i = 0; i <copyOfArray.length ; i++) {
            System.out.print("[" + copyOfArray[i] + "],");
        }

    }

    public static int[] copyOf(int[] array) {
        int[] copyOfArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copyOfArray[i] = array[i];
            } return copyOfArray;
        }
    }



