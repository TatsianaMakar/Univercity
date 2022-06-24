package homeTask5;

public class Task3 {

    public static void main(String[] args) {
        for (int i = 3; i <= 120; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
