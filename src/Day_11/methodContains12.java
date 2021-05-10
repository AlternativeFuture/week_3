package Day_11;

import java.util.Scanner;

public class methodContains12 {
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
        System.out.println(contains(array, key));
        System.out.println("Test case pass " + testContains());
    }

    public static boolean contains(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return true;
            }
        }
        return false;
    }

    public static boolean testContains() {
        int[] array = {15, 25, 30, 50, 10, 17};
        int key1 = 25, key2 = 31;
        return contains(array, key1) && !contains(array, key2);
    }
}


