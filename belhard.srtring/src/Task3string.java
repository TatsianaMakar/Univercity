public class Task3string {

    public static void main(String[] args) {
        String st1 = "My name is Tanya. I am from Minsk.";
        String st2 = "Tanya";
        String st3 = " ";
        String st4 = null;
        String st5 = "";
        System.out.println("1");
        worldCount(st1);
        System.out.println("2");
        worldCount(st2);
        System.out.println("3");
        worldCount(st3);
        System.out.println("4");
        worldCount(st4);
        System.out.println("5");
        worldCount(st5);

    }

    static void worldCount(String st1) {
        if (st1 != null) {
            if (st1.length() != 0) {
                String[] worlds = st1.split(" ");
                System.out.println("There is " + worlds.length + " world in the line.");
            } else {
                System.out.println("There is not worlds in the line.");
            }
        } else {
            System.out.println("There is not worlds in the line.");
        }
    }

}
