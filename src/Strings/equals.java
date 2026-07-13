package Strings;

public class equals {
    public static void main(String[] args) {
        String s = "qwertt";
        String a = "qwertt";
        String b = new String(s);
        String c= "qwer";
        c += "tt";
        System.out.println(s==a);
        System.out.println(s==b);
        System.out.println(s==c);
        System.out.println(s.equals(b));
        System.out.println(s.equals(c));

    }

}
