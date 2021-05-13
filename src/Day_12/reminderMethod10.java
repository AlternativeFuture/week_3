package Day_12;

public class reminderMethod10 {
    public static void main(String[] args) {
        start();
    }

    public static int reminder(int value) {
        int sum = 0;
        while (value != 0) {
            sum += value % 10;
            value /= 10;
        }
        return sum;
    }

    public static double reminder(int value, int naturalNUmber) {
        int sum = 0;
        while (value != 0) {
            sum += value % naturalNUmber;
            value /= 10;
        }
        return sum % 5;
    }

    public static void start() {

        System.out.println((reminder(331)));
        System.out.println(reminder(331,5));
    }
}

