import java.util.Arrays;

public class Task2SelectionSort {

    public static void main(String[] args) {
        int[] array = new int[]{10, 2, 10, 3, 1, 2, 5};
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minId = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minId = j;
                }
            }
            // замена
            int temp = array[i];
            array[i] = min;
            array[minId] = temp;

            System.out.println(Arrays.toString(array));
        }
    }
    }