package util;

import exception.WrongLoginException;
import exception.WrongPasswordException;

import java.util.regex.Pattern;

public class PasswordAndLoginUtil {
    public static void checkLogin(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        boolean result=login.matches("\\w{1,20}");
        if(login.length()>5||!result){
            throw new WrongLoginException("Login is wrong");
        } else {
            boolean result1=password.matches("\\w{1,20}");
            if(password.length()>5||!result1||!password.equals(confirmPassword)){
                throw new WrongPasswordException("Login is right! Password is wrong!");
            } else {
                System.out.println("Welcome!");
            }
        }
    }

}
