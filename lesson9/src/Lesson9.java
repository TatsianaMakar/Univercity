import exception.AgeException;
import util.AgeUtil;

import java.util.Arrays;

public class Lesson9 {
    public static void main(String[] args) {
//        int age=19;
////if (age<20||age>120){
//    try {
//        if (age<20||age>120) {
//            //}
//            throw new AgeException("bad age");
//        }
//    } catch (AgeException e) {
//        e.printStackTrace();
//    }

//        System.out.println("start");
//        try{
//            int a=8;
//            int b=2;
//            int c=a/b;
//            System.out.println(c);
//        } catch (Exception ae){
//            System.out.println("Mistake");
//            ae.printStackTrace();
//        } finally {
//            System.out.println("the end");
//        }
//        System.out.println("end");
        int age=56;
        AgeUtil.checkAge(age);
    }
}
