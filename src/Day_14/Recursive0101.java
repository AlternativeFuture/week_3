package Day_14;

public class Recursive0101 {
    public static void main(String[] args) {
        int[] array = {25, 44, 37, 5};
        int len = array.length - 1;
        System.out.println(countSumOfArray(array, len));

    }


    public static int countSumOfArray(int[] array, int len) {
        if (len == 0) {
            return array[0];
        }
        return array[len] + countSumOfArray(array, len - 1);
    }
}
