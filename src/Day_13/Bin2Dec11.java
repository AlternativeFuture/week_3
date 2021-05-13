package Day_13;

import java.util.Scanner;

public class Bin2Dec11 {
    public static void main(String[] args) {
        start();
    }

    public static boolean checkBinStr(String str) {
        return str.matches("[0-1]+");
    }

    public static int bin2Dec(String str) {
        return Integer.parseInt(str,2);

    }

    public static void start() {
        System.out.print("Enter a string :");
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        if(!checkBinStr(sentence)){
            System.out.println("error: invalid binary string " + "\"" + sentence + "\"");
        } else {
            System.out.println("The equivalent decimal number for binary \""+ sentence + "\" is: " +bin2Dec(sentence));
        }
    }
}


