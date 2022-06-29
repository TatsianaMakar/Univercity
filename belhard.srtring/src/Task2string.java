public class Task2string {

    public static void main(String[] args) {
        String st1 = "1234 012 34500";
        lettersCount(st1);

    }

    static void lettersCount(String st1) {
        int count;
        char[] Mass = new char[st1.length()];
        for (int i = 0; i < st1.length(); i++) {
            Mass[i] = st1.charAt(i);
            count=0;
            if (Mass[i]==0) {
                count++;
                System.out.println("Symbol: " + Mass[i] + " repeats " + count + " time(s).");
            }
        }

        for (int i = 0; i < st1.length(); i++) {
            count = 0;
            for (int j = i + 1; j < st1.length(); j++) {
                if (Mass[i] == Mass[j] && Mass[j] != 0) {
                    Mass[j] = 0;
                    count++;
                }
            }
            if (count > 0) {
                System.out.println("Symbol: " + Mass[i] + " repeats " + count + " time(s).");
            } else if (count == 0 && Mass[i] != 0) {
                System.out.println("Symbol: " + Mass[i] + " doesn't repeat.");
            }

        }

    }

}
