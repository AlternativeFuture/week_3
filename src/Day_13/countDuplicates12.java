package Day_13;

import java.util.Scanner;

public class countDuplicates12 {
    public static void main(String[] args) {
        start();
    }

    public static int countDuplicates(String str) {
        boolean flag;
        int count = 0;
        StringBuilder sb = new StringBuilder();
        sb.append(str);

        for (int i = 0; i < sb.length()-1; i++) {
            flag = false;
            if (sb.charAt(i) != '\"') {
                for (int j = i+1; j < sb.length() - 1; j++) {
                    if (sb.charAt(i) != '\"') {
                        if (sb.charAt(i) == sb.charAt(j)) {
                            flag = true;
                            sb.replace(j, j + 1, "\"");

                        }
                    }
                }
            }
            if (flag && sb.charAt(i) !='\"') {
                sb.replace(i, i + 1, "\"");
                count++;
            }
        }
        return count;
    }
    public static void start(){
        System.out.print("Enter a string :");
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        System.out.println(countDuplicates(sentence));
    }
}




