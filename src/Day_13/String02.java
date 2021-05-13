package Day_13;

public class String02 {
    public static void main(String[] args) {
        String str = "jskfksdfljsjfsd";
        int index = 5;
        System.out.println(returnChar(str, index));
    }

    public static String returnChar(String str, int index) {
        return str.substring(index, index + 1);
    }
}

