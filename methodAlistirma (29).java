import java.util.Arrays;

public class ornek39 {
    public static int[] getMaxValues(int[][] array) {
        int[] maxValues = new int[array[0].length];

        for (int i = 0; i < array[0].length; i++) {
            int max = array[0][i];
            for (int j = 1; j < array.length; j++) {
                if (array[j][i] > max) {
                    max = array[j][i];
                }
            }
            maxValues[i] = max;
        }

        return maxValues;
    }

    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] maxValues = getMaxValues(array);

        System.out.println("Arrayin sütunlarındaki en büyük değerler: " + Arrays.toString(maxValues));
    }
}
