package Day_13;

import java.util.Scanner;

public class nonRepeatedCharacter13 {
    public static void main(String[] args) {
        start();
    }

    public static String getNonRepeatedCharacter(String str) {

        for (int i = 0; i < str.length() - 1; i++) {
            boolean flag = false;
            for (int j = i + 1; j < str.length() - 1; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    i++;
                    flag = true;
                }
            }
            if (!flag) {
                return Character.toString(str.charAt(i));
            }
        }
        return "All characters are repeated";
    }
    public static void start() {
        System.out.print("Enter a string :");
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        System.out.println(getNonRepeatedCharacter(sentence));
    }
}



