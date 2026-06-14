package strings;

public class interningString {
    public static void main(String[] args) {
        String s ="Ram";
        String r ="Ram";
        String t =new String("Ram");
        System.out.println(t);
        // Ram->Aam
        // s.charAt(0) = 'A';  ---> error
    }
}
