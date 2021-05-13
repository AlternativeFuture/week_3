package Day_13;

import java.util.Scanner;

public class String05 {
    public static void main(String[] args) {
        start();
    }

    public static String reverseString(String sentence) {
        StringBuilder sb = new StringBuilder(sentence);
        return sb.reverse().toString();
    }


    public static void start() {
        System.out.print("Enter a string :");
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        System.out.println("The reverse of the String \""+ sentence + "\" is \""+ reverseString(sentence) + '"');
    }
}