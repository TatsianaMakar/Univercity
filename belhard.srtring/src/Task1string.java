public class Task1string {
    public static void main(String[] args) {
        String st=" J A V A ";
        DeleteWhitespace(st);

    }
    static void DeleteWhitespace(String st){
        System.out.println(st.replace(" ",""));
    }
}
