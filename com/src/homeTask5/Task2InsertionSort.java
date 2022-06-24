package homeTask5;

import java.util.Arrays;

public class Task2InsertionSort {
    public static void main(String[] args) {
        int[] array = new int[]{10, 2, 9, 3, 1, 8, 5};
        System.out.println(Arrays.toString(array));

        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while(j >= 0 && current < array[j]) {
                array[j+1] = array[j];
                j--;
            }
            // в этой точке мы вышли, так что j так же -1
            // или в первом элементе, где текущий >= a[j]
            array[j+1] = current;
            System.out.println(Arrays.toString(array));
        }

           // System.out.println(Arrays.toString(array));
        }
}
