package Day_11;

import java.util.Scanner;

public class methodSearch13 {
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
        System.out.print("Input key_");
        int key = scanner.nextInt();
        System.out.println("Index of key " + search(array, key));


    }

    public static int search(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        } return -1;
    }
}


