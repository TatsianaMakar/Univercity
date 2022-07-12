import exception.WrongLoginException;
import exception.WrongPasswordException;
import util.PasswordAndLoginUtil;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


       checkLoginAndPassword("vegaФ", "55555", "55555");
    }
    static boolean checkLoginAndPassword(String login, String password, String confirmPassword){
        boolean result;
        try{
            PasswordAndLoginUtil.checkLogin(login, password, confirmPassword);
            result=true;
            System.out.println(result);
            return result;
        } catch (WrongLoginException wle){
            System.out.println(wle.getMessage());
            result=false;
            System.out.println(result);
            return result;
        } catch (WrongPasswordException wpe){
            System.out.println(wpe.getMessage());
            result=false;
            System.out.println(result);
            return result;
        }
    }
}
