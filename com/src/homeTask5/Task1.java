import java.util.Arrays;

public class Task1 {

    public static void main(String[] args) {
        double[] array = new double[5];

        for(int i = 0; i < array.length; ++i) {
            array[i] = Math.random();
        }

        System.out.println(Arrays.toString(array));
        double min = array[0];
        double max = array[0];
        double average = 0.0;
        double sum = 0.0;
        double[] var10 = array;
        int var11 = array.length;

        for(int var12 = 0; var12 < var11; ++var12) {
            double i = var10[var12];
            if (i < min) {
                min = i;
            }

            if (i > max) {
                max = i;
            }

            sum += i;
            average = sum / (double)array.length;
        }

        System.out.println("min=" + min);
        System.out.println("max=" + max);
        System.out.println("average=" + average);
    }
}
