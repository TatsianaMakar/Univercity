package homeTask5;

public class Task2RecHard {

    public static void main(String[] args) {

        System.out.println(sum(1330));
    }

    static int summa;

    static int sum(int number) {
//esli number=0, to propuckayu eto chislo
        if (number == 0) {
            return summa;
        }
//esli number<10, to pribavlayu eto chislo k summe
        if (number < 10) {
            return summa + number;
        }
//esli number >10, to delyu ego na (10*(kolichestvo znakov-1))
        int number1 = number / (int) Math.pow(10, (int) Math.log10(number));
//peredayu v metod novyi number number-number1*10*(kolichestvo znakov-1)
        sum(number - number1 * (int) Math.pow(10, (int) Math.log10(number)));
        return number1 + sum(number - number1 * (int) Math.pow(10, (int) Math.log10(number)));
    }
}
