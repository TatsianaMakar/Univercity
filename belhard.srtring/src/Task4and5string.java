public class Task4and5string {

    public static void main(String[] args) {
        String st1 = "0123456789";
        String st2 = null;
        String st3 = "";
        overTurn(st1);
        overTurn(st2);
        overTurn(st3);
    }

    static void overTurn(String st1) {
        if (st1 != null) {
            char[] newMass = new char[st1.length()];
            for (int i = 0; i < st1.length(); i++) {
                newMass[i] = st1.charAt(st1.length() - 1 - i);
            }
            System.out.println(st1.valueOf(newMass));
        }
    }

}
