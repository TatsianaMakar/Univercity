package arraylist;

import java.util.ArrayList;
import java.util.LinkedList;

public class HomeTaskArraylist {
    public static void main(String[] args) {
        ArrayList <Integer> arList=new ArrayList<Integer>();
        long startTime = System.nanoTime();
        method1(arList);
        method2(arList);
        long stopTime = System.nanoTime();
        System.out.println("Methods of arraylist takes "+(stopTime - startTime)+" nanoseconds");

        LinkedList <Integer> lnList=new LinkedList<Integer>();
        long startTime1 = System.nanoTime();
        method3(lnList);
        method4(lnList);
        long stopTime1 = System.nanoTime();
        System.out.println("Methods of linkedlist takes "+(stopTime1 - startTime1)+" nanoseconds");
    }
    static void method1 (ArrayList <Integer> arList){
        int count=0;
        while (count<1_000_000){
            arList.add((int)(Math.random()*11));
            count++;
        }
    }
    static void method2 (ArrayList <Integer> arList){
        int count=0;
        while (count<100_000){
            int i=(int)(Math.random()*(arList.size()-1));
            count++;
        }
    }
    static void method3 (LinkedList<Integer> lnList){
        int count=0;
        while (count<1_000_000){
            lnList.add((int)(Math.random()*11));
            count++;
        }
        //System.out.println(lnList);
    }
    static void method4 (LinkedList<Integer> lnList){
        int count=0;
        while (count<100_000){
            int i=(int)(Math.random()*(lnList.size()-1));
            //System.out.println(lnList.get(i));
            count++;
        }
    }
}
