package Day_13;

import java.util.Locale;
import java.util.Scanner;

public class hexaDecimal10 {
    public static void main(String[] args) {
        System.out.print("Enter a hex string: ");
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine().toLowerCase(Locale.ROOT);
        if (checkHex(sentence)) {
            System.out.println(sentence +" is a hex string");
        } else {
            System.out.println(sentence + "is NOT a hex string");
        }

    }

    public static boolean checkHex(String str) {
        return str.matches("[0-9|a-f]+") ;
    }
}
