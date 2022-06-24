package homeTask5;

public class Task1Rec {

    public static void main(String[] args) {
        num(5);
    }

    static int num(int n) {
        System.out.println(n);
        if (n == 0) {
            return 0;
        }
        return num(n-1);
    }
}
