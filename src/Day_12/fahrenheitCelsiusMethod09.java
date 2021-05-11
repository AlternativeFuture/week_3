package Day_12;

public class fahrenheitCelsiusMethod09 {
    public static void main(String[] args) {
        start();
    }

    public static int fahrenheitCelsius(float fahrenheit) {
        return (int) (fahrenheit - 32) * 5 / 9;
    }

    public static double fahrenheitCelsius(int fahrenheit) {
        return (double) (fahrenheit - 32) * 5 / 9;
    }

    public static void start() {
        System.out.println(fahrenheitCelsius(45f));
        System.out.println(fahrenheitCelsius(55));
    }
}

