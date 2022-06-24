package homeTask5;

import java.util.Arrays;

public class Task4 {

    public static void main(String[] args) {
        int[] array1 = {5, 30, 40, 20, 100, 10};
        int[] array2 = {30, 40, 100, 100};
        int[] array3 = new int[0];

        int newLength = 0;
        int count = 0;
        System.out.println("Ishodniy massiv: " + Arrays.toString(array1));
//obnylayu v array1 elementi, sovpadayuschie s elementami array2
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array2[j] == array1[i]) {
                    array1[i] = 0;
                }
            }
        }
// sortiryu array1 (nylevie elementi v konec)
        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array1.length - 1; i++) {
                if (array1[i] < array1[i + 1]) {
                    isSorted = false;

                    buf = array1[i];
                    array1[i] = array1[i + 1];
                    array1[i + 1] = buf;
                }
            }
        }
        System.out.println("Massiv s obnulennimi elementami: " + Arrays.toString(array1));
// sozdayu novij massiv razmerom, ravnym kolichestvy nenulrvyh elementov v array1
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == 0) {
                count++;
            }
            newLength = array1.length - count;
            array3 = new int[newLength];
        }
//zapolnayu novyi massiv
        for (int i = 0; i < array3.length; i++) {
            array3[i] = array1[i];
        }
        System.out.println("Finalniy massiv: " + Arrays.toString(array3));
    }
}


