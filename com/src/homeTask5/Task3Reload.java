package homeTask5;

public class Task3Reload {
    public static void main(String[] args) {
        System.out.println(square(2));
        System.out.println(square(4, true));
        System.out.println(square(4, false));

    }

    static double square(int r) {
        return Math.PI * Math.pow(r, 2);
    }

    static double square(int dOrL, boolean check) {
        if (check == true) {
            return Math.PI * Math.pow(dOrL, 2) / 4;
        } else {
            return Math.pow(dOrL, 2) / (4 * Math.PI);
        }
    }
}
