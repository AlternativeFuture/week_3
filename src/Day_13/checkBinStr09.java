package Day_13;

import java.util.Scanner;

public class checkBinStr09 {
    public static void main(String[] args) {
        System.out.print("Enter a string :");
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        if (checkBinStr(sentence)) {
            System.out.println(sentence +" is a binary string");
        } else {
            System.out.println(sentence + " is NOT a binary string");
        }

    }

    public static boolean checkBinStr(String str) {
        return str.matches("[0-1]+") ;
    }
}
