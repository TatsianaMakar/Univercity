package homeTask5;

public class Task2Rec {

    public static void main(String[] args) {
        System.out.println(num(3));

    }
    static int num(int n) {
        if (n == 0) {
            return 0;
        }
        return n + num(n - 1);
    }
}
