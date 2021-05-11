package Day_12;

import java.util.Scanner;

public class printMethod04 {
    public static void main(String[] args) {
        start();
    }

    public static void print(int[] array) {
        int len = array.length;
        System.out.print("[");
        for (int i = 0; i < len; i++) {
            if (i < len -1) {
                System.out.print(array[i] + ",");
            } else {
                System.out.println(array[i] + "]");
            }
        }
    }

    public static void print(float[] array) {
        int len = array.length;
        System.out.print("[");
        for (int i = 0; i < len; i++) {
            if (i < len -1) {
                System.out.print(array[i] + ",");
            } else {
                System.out.println(array[i] + "]");
            }
        }
    }

    public static void print(double[] array) {
        int len = array.length;
        System.out.print("[");
        for (int i = 0; i < len; i++) {
            if (i < len -1) {
                System.out.print(array[i] + ",");
            } else {
                System.out.println(array[i] + "]");
            }
        }
    }

    public static void start() {
        int[] arrayInt =  {45,55,65,77};
        float[] arrayFloat =  {66,75,95,760};
        double[] arrayDouble =  {45,55,65,77};
        print(arrayInt);
        print(arrayFloat);
        print(arrayDouble);
    }


}
