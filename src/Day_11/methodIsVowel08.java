package Day_11;

import java.util.Scanner;

public class methodIsVowel08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a_");
        char a = scanner.nextLine().toLowerCase().charAt(0);
        System.out.println(isVowel(a));
    }

    public static boolean isVowel(char str) {
        switch (str) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'y':
                return true;
            default:
                return false;
        }
    }
}


