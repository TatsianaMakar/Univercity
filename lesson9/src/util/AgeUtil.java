package util;

import exception.AgeException;
import exception.TooOldException;
import exception.TooYoungException;

public class AgeUtil {
    public static void checkAge(int age) {
        try {
checkAgeYoung(age);
checkAgeOld(age);

//            if (age < 20) {
//                throw new TooYoungException("too young");
//            } else if (age > 120) {
//                throw new TooOldException("too old");
//            }
            System.out.println("ready to work");
        } catch (TooYoungException | TooOldException e){
            System.out.println(e.getMessage());
            //e.printStackTrace();
        }


    }
    private static void checkAgeYoung(int age) throws TooYoungException {
        if(age<20){
            throw new TooYoungException("too young");
        }
    }
    private static void checkAgeOld(int age) throws TooOldException {
        if(age>120){
            throw new TooOldException("too old");
        }
    }
}
