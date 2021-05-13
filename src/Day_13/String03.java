package Day_13;

public class String03 {
    public static void main(String[] args) {
        String str = "discussed";
        char char1 = 'a';
        System.out.println(isContain(str, char1));
    }

    public static boolean isContain(String str, char char1) {
        return str.contains(Character.toString(char1));
    }
}

