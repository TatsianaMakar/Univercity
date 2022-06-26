package deal;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Deal {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Vvedite kolichestvo igrokov:");
        n=sc.nextInt();

        while (n<=1||n>5){
            System.out.println("V igre ne mojet bit bolshe 5 igrokov i menshe 2.");
            System.out.println("Vvedite novoe kolichestvo igrokov:");
            n=sc.nextInt();
        }
        String[]suits={"Pik ","Buben ","Cherv ","Tref "};
        String[]rank={"2 ","3 ","4 ","5 ","6 ","7 ","8 ","9 ","10 ","Valet ","Koroleva ","Korol ","Tuz "};
        String []cards=new String[rank.length*suits.length];
        String []sortedCards=new String[rank.length*suits.length];

        //sozdayu kolody nesortirovannih cart
        int count=0;
        for (int i=0; i<rank.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                count++;
                cards[count-1]=rank[i]+suits[j];
            }
        }
        System.out.println(Arrays.toString(cards));

       // sortiryu kolody cart
        Random rnd=new Random();
        for(int i = 0; i < cards.length; i++) {
            int index = rnd.nextInt(i + 1);
            String a = cards[index];
            cards[index] = cards[i];
            cards[i] = a;
        }

        System.out.println(Arrays.toString(cards));

        //razdayu karti igrokam
       int countPlayerCards=1;
       count=0;
        for (int i=1; i<=n; i++){
            System.out.println("\nKarti igroka " + i + ":");
            countPlayerCards=1;
        for (int j=0;j < cards.length; j++){
            while (countPlayerCards<=5) {
                countPlayerCards++;
                count++;
                System.out.print(cards[j + count - 1]+",");
            }
        }
        }

        sc.close();
    }
}
