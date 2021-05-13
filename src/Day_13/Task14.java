package Day_13;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        start();
    }

    public static int getNonRepeatedCharacter(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (ch == str.charAt(i)) {
                count++;
            }
        }
        return count;
    }

    public static void start(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string :");
        String sentence = scanner.nextLine();
        System.out.print("Enter a char :");
        char ch = scanner.next().charAt(0);
        System.out.println(getNonRepeatedCharacter(sentence, ch));
    }
}




