public class Main {
    public static void main(String[] args) {
        String st1=null;
        String st2="23a56789y";
        method1(st1,st2);
        method2(st1,st2);
        StringBuffer sb=new StringBuffer("25+40=65");
        StringBuffer sb1=new StringBuffer("25+40=65");
        method3(sb);
        method4(sb1);
    }
    static boolean method1(String st1, String st2){
        boolean bool;
        if (st1==null||st2==null||st1.length()<5||st2.length()<5){
            bool=false;
            System.out.println("Stroka menshe 5 simvolov ili pusta");
        } else {
            st1=st1.substring(st1.length()-5,st1.length());
            System.out.println(st1);
            st2=st2.substring(st2.length()-5,st2.length());
            System.out.println(st2);
            if (st1.endsWith(st2)) {
                bool = true;
                System.out.println("Poslednie 5 simvolov sovpadaut");
            } else {
                bool = false;
                System.out.println("Poslednie 5 simvolov ne sovpadaut");
            }
        }
        return bool;
    }

    static boolean method2(String st1, String st2){
        String stNew="a";
        boolean bool;
        if (st1==null||st2==null){
            bool=false;
            System.out.println("Stroka pusta");
        } else {
            if (st1.indexOf(stNew)>=0&&st2.indexOf(stNew)>=0) {
                bool = true;
                System.out.println("'a' est v obeih strokah");
            } else {
                bool = false;
                System.out.println("'a' net v obeih strokah");
            }
        }
        return bool;
    }

    static void method3 (StringBuffer sb){
        String str="equals";
        sb.deleteCharAt(5);
        System.out.println(sb.insert(5,str));
    }

    static void method4 (StringBuffer sb){
        String str="equals";
        System.out.println(sb.replace(5,6,str));
    }

}
