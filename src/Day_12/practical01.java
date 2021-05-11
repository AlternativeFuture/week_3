package Day_12;

public class practical01 {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 55};
        int[][] matrix = {{10, 20, 30, 40, 55}, {10, 20, 30, 40, 55}, {10, 20, 30, 40, 55}};
        System.out.println(convert(array));
        System.out.println(convert(matrix));
    }

    public static double convert(int[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }

    public static double convert(int[][] matrix) {
        double sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                sum += matrix[i][j];
            }

        }
        return sum;
    }
}
