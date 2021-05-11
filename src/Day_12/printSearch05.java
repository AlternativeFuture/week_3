package Day_12;

public class printSearch05 {
    public static void main(String[] args) {
        start();
    }

    public static int search(int[] array) {
        return array.length;
    }

    public static int search(int[] array, int a) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == a) {
                return i;
            }
        }
        return -1;
    }

    public static boolean search(int[] array, int argument, int index) {
        return array[index] == argument;
    }


    public static void start() {
        int[] array = {45, 55, 65, 77};
        int a = 55;
        System.out.println(search(array));
        System.out.println(search(array, a));
        System.out.println(search(array,65,2));
    }
}
